class A{
    public void display1() {
        System.out.println("THis is parent class");
    }}

class inhert extends A{
    public void display2(){
        System.out.println("This is child class");
    }
    public static void main(String args[]){
        inhert o=new inhert();
        o.display1();
        o.display2();
    }
}

