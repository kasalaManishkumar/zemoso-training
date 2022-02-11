class Home{
    private Kitchen kitchen;
    Home(){
        kitchen=new Kitchen();
        kitchen.setFood("pasta");
    }
    public String getFood(){
        return kitchen.getFood();
    }
}
class Kitchen{
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
class composition{
    public static void main(String args[]){
        Home home=new Home();
        System.out.print(home.getFood());
    }

    //method overloading same name diff argu
}