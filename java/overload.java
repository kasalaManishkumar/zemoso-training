class Calculate{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public double sum(double a,double b){
        return a+b;
    }
}
class overload{
    public static void main(String args[]){
        Calculate calculate=new Calculate();
        System.out.println(calculate.sum(10,20));
        System.out.println(calculate.sum(10.0,20.0f));
        System.out.println(calculate.sum(10,20,30));
    }
}//byte->short->int->long->float->double
//              char