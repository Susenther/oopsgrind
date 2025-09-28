import java.util.*;
public class set {
    private String name;

    public string getName(){return name;}
    public void setName(String N){
        this.name = N;
    }
}

class GFG {
    public static void main(String []args){

        Set obj = new Set();

        obj.setname("Geeks for geeks");

        System.out.println(obj.getname());
    }
}
