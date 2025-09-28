package unnecessary;
import java.util.*;
public class abs {
    

    public abstract class shape{
        protected final String color;

        public shape(String color){
            this.color = color;
        }

        public abstract double area();

        public void describe(){
            System.out.println("shape color: "+color);

        }
    }
    public class Circle extends shape{
        private final double radius;

        public Circle(double radius,String color){
            super(color);
            this.radius = radius;
        }
        @Override
        public double area(){
            return Math.PI * radius * radius;
        }
    }
}
