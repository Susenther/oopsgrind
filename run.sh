#!/usr/bin/env bash
set -euo pipefail

# ----------------------------
# run.sh - compile & run Java
# Usage:
#   run.sh                     -> runs default package "unnecessary"
#   run.sh <package>           -> run detected main in <package>
#   run.sh <package> <Class>   -> run <package>.<Class>
# Examples:
#   run.sh
#   run.sh unnecessary
#   run.sh unnecessary BankLoser
# ----------------------------

# resolve the *real* path of this script (works even if symlinked)
SOURCE="${BASH_SOURCE[0]}"
if command -v readlink >/dev/null 2>&1; then
  SCRIPT_PATH="$(readlink -f "$SOURCE")"
elif command -v realpath >/dev/null 2>&1; then
  SCRIPT_PATH="$(realpath "$SOURCE")"
else
  # fallback to python
  SCRIPT_PATH="$(python -c "import os,sys; print(os.path.realpath(sys.argv[1]))" "$SOURCE")"
fi

REPO_ROOT="$(dirname "$SCRIPT_PATH")"

# locate src directory (project layout: REPO_ROOT/oopsdraft/src or REPO_ROOT/src)
if [ -d "$REPO_ROOT/src" ]; then
  SRC_ROOT="$REPO_ROOT/src"
elif [ -d "$REPO_ROOT/oopsdraft/src" ]; then
  SRC_ROOT="$REPO_ROOT/oopsdraft/src"
else
  echo "Error: could not locate src/ directory under $REPO_ROOT"
  exit 1
fi

BIN_DIR="$REPO_ROOT/bin"
DEFAULT_PKG="unnecessary"

# args
pkg=""
cls=""

if [ $# -eq 0 ]; then
  pkg="$DEFAULT_PKG"
elif [ $# -eq 1 ]; then
  # allow user to pass fully-qualified classname like 'unnecessary.BankLoser' optionally
  if [[ "$1" == *.* ]]; then
    # split at last dot
    fq="$1"
    pkg="${fq%.*}"
    cls="${fq##*.}"
  else
    pkg="$1"
    cls=""
  fi
else
  pkg="$1"
  cls="$2"
fi

# sanity: javac + java
if ! command -v javac >/dev/null 2>&1; then
  echo "Error: javac not found in PATH. Install JDK or add javac to PATH."
  exit 1
fi
if ! command -v java >/dev/null 2>&1; then
  echo "Error: java not found in PATH. Install JRE/JDK or add java to PATH."
  exit 1
fi

mkdir -p "$BIN_DIR"

echo "Compiling Java sources from: $SRC_ROOT -> $BIN_DIR"
# compile everything (safe)
find "$SRC_ROOT" -name '*.java' -print0 | xargs -0 javac -d "$BIN_DIR"

# decide class to run
if [ -n "$cls" ]; then
  RUN_CLASS="${pkg}.${cls}"
else
  # locate package dir
  pkg_dir="$SRC_ROOT/$(echo "$pkg" | tr '.' '/')"
  if [ ! -d "$pkg_dir" ]; then
    echo "Error: package directory not found: $pkg_dir"
    exit 1
  fi

  # try to find explicit main method
  main_file="$(grep -R -F "public static void main(String[] args)" "$pkg_dir" --include='*.java' -l 2>/dev/null | head -n1 || true)"

  if [ -n "$main_file" ]; then
    class_name="$(basename "$main_file" .java)"
    echo "Detected main in: $class_name (from $main_file)"
  elif [ -f "$pkg_dir/Main.java" ]; then
    class_name="Main"
    echo "Found Main.java -> using Main"
  else
    # fallback to first java file in package
    first_java="$(find "$pkg_dir" -maxdepth 1 -name '*.java' | head -n1 || true)"
    if [ -z "$first_java" ]; then
      echo "Error: no .java files found in package dir $pkg_dir"
      exit 1
    fi
    class_name="$(basename "$first_java" .java)"
    echo "Warning: couldn't detect main. Falling back to $class_name"
  fi

  RUN_CLASS="${pkg}.${class_name}"
fi

echo "Running: java -cp $BIN_DIR $RUN_CLASS"
echo
echo
java -cp "$BIN_DIR" "$RUN_CLASS"
echo