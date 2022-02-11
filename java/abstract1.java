import java.util.*;
abstract class Demo{
    public abstract void method();
}
public class abstract1 extends Demo{
    public void method(){
        System.out.print("the method is initalized");
    }
    public static void main(String args[]){
    Demo d=new abstract1();
    d.method();
    }
}

