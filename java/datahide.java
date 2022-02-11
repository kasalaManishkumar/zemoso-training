class Account{
    private String username="manish";
    private String password="100";
    private int balance=20000;

    public int getBalance(String username,String password) {
        if(this.username.equals(username) && this.password.equals(password)){
        return balance;}
        return 0;
    }
}
class datahide{
    public static void main(String args[]){
        Account a=new Account();
        System.out.print(a.getBalance("manish","100"));
    }
}
