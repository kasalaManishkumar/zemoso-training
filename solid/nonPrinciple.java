//Single responsibility && interface segregation...............................................
class Vechicle{
    public void printDetails(){
        System.out.println("the details are printed");
    }
    public void addDetailsDB(){
        System.out.println("the vechicle details are added to database");
    }
    public void CalculateValue(){
        System.out.println("the value is calculated");
    }

}

//open-closeed principle..................................................
class Engine{
    public void normalEngine(){
        System.out.println("This is a genral engine");
    }
}
class Car{

    public void normalEngine(){
        System.out.println("this is a car engine");
    }
}

//liskov principle..........................................................

class person{
        public void eat(){
            System.out.print("this person can eat");
        }
}
class Employee{
    public void eat(){
        System.out.print("this person can eat");
    }
    public void earn(){
        System.out.print("he can earn");
    }
}


//Dependency inversion............................................
class truck{
    private Eng eng;
    public truck(Eng eng){
        this.eng=eng;
    }
    public void start(){
        eng.start();
    }
}
class Eng{
    public void start(){
        System.out.println("this is a genral engine");
    }
}

// Interface segrgation............................................
class Human{
    public void sleep(){
        System.out.println("he can sleep");
    }
    public void eat(){
        System.out.println("he can eat");
    }
    public void exercise(){
        System.out.println("he can exercise");
    }
}
class Emp {
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
class Student{
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
class nonPrinciple{
    public static void main(String args[]){
        Vechicle vechicle=new Vechicle();
        vechicle.addDetailsDB();
        vechicle.printDetails();
        vechicle.CalculateValue();
        Car car=new Car();
        car.normalEngine();
        Employee employee=new Employee();
        employee.earn();
        employee.eat();
        Emp emp=new Emp();
        emp.eat();
        emp.work();
        emp.exercise();
        emp.sleep();
        Eng eng=new Eng();
        eng.start();
    }
}
