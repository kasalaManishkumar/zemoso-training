import java.util.*;
class demo{
    public int add(int a,int b){
        return a+b;
    }
}
class override1 extends demo {
    @java.lang.Override
    public int add(int a, int b) {
        return (a + b);
    }

    public static void main(String args[]) {
        override1 o = new override1();
        System.out.print(o.add(10, 20));
    }
}
// we can not protect the derived class while base class is have little less like public modifier and dervied as protected and vice versa is possible
// we can not override static and final methods
