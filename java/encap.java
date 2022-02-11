import java.util.*;
class Account{
    private int balance;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
class encap{
    public static void main(String args[]){
        Account a=new Account();
        a.setBalance(1000);
        System.out.print(a.getBalance());
    }

}

