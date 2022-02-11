//single responsibility ......................
class Vechicle{

    public void addDetailsDB(){
        System.out.println("the vechicle details are added to database");
    }
}
class CalculateValue{
    public void Calculate(){
        System.out.println("the value is calculated");
    }
}
class PrintDetails{
    public void print(){
    System.out.println("the details are printed");
    }
}

//open-closeed principle..................................................
class Engine{
    public void normalEngine(){
        System.out.print("this is a genral engine");
    }
}
class Car extends Engine{
    public void normalEngine(){
        System.out.print("this is a car engine");
    }
}
//liskov principle........................................
class person{
    public void eat(){
        System.out.print("this person can eat");
    }
}
class Employee extends  person{
    public void earn(){
        System.out.print("he can earn");
    }
}


//Interface segregation...................................
interface Human{
    public void sleep();
    public void eat();
    public void exercise();
}
class Student implements Human{
    public void sleep(){
        System.out.println("he can sleep");
    }
    public void eat(){
        System.out.println("he can eat");
    }
    public void exercise(){
        System.out.println("he can exercise");
    }
    public void study(){
        System.out.println("he can study");
    }
}
class Empl implements Human{
    public void sleep(){
        System.out.println("he can sleep");
    }
    public void eat(){
        System.out.println("he can eat");
    }
    public void exercise(){
        System.out.println("he can exercise");
    }
    public void work(){
        System.out.println("he can work");
    }
}
//depedency inversion....................................
interface EngineInterface{
    public void start();
}
class Truck{
    private EngineInterface engine;
    public Truck(EngineInterface engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
}
class PetrolEngine implements EngineInterface{
    public void start(){
        System.out.println("it uses pertrol");
    }
}
class DieselEngine implements EngineInterface{
    public void start(){
        System.out.println("it uses desiel");
    }
}
class principle{
    public static void main(String args[]){
        Vechicle vechicle=new Vechicle();
        vechicle.addDetailsDB();
        CalculateValue calculateValue=new CalculateValue();
        calculateValue.Calculate();
        PrintDetails printDetails=new PrintDetails();
        printDetails.print();
        Car car=new Car();
        car.normalEngine();
        Employee employee=new Employee();
        employee.eat();
        employee.earn();
        Student student=new Student();
        student.eat();
        student.study();
        student.exercise();
        student.sleep();
        PetrolEngine truck=new PetrolEngine();
        truck.start();
}}