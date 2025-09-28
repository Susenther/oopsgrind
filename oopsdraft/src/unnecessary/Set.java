package unnecessary;
import java.util.*;
public class Set {
    public Set(){

    }
    private String name;

    public String getName(){return name;}
    public void setName(String N){
        this.name = N;
    }
}

class GFG {
    public static void main(String []args){

        Set obj = new Set();

        obj.setName("Geeks for geeks");

        System.out.println(obj.getName());
    }
}
