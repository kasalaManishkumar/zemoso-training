import java.util.*;
interface Test{
    static final string a="static constant";
    public void m1();
    public void m2();
    static void m3(){
        System.out.print("this is m3");
    }
    default int m4(){ return 0};
    private void m5(){
        System.out.println("this is m5");
    }
}
class InterfaceDemo implements Test{
    public void m1(){
        Sytem.out.println("this is m1");
    }
    public void m2(){
        Sytem.out.println("this is m2");
    }
    default int m4(){return Test.super.m4();}

    InterfaceDemo t=new InterfaceDemo();
    t.m1();
    t.m2();
    m3();
    System.out.println(t.m4());
    t.m5();
}

