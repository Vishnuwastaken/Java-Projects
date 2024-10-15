import java.util.Scanner;

public class Account {
    static Scanner input = new Scanner(System.in);
    private String accountnum;
    private String name;
    private float balance;
    public Account(){
        accountnum = null;
        name = null;
        balance = 0;
    }
    public Account(String accountnum, String name, float balance){
        this.accountnum =  accountnum;
        this.name = name;
        this.balance = balance;
    }
    public String toString(){
        return ("account number is: " + accountnum + " name is: " +  name + " balance is: " + balance);
    }
    public void deposit(){
        System.out.println("Enter amount to deposit: ");
        float amt = input.nextFloat();
        balance+=amt;
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        float amt = input.nextFloat();
        if (amt>balance){
            System.out.println("You don't have enough money");
        }
        else {
            balance = balance-amt;
            System.out.println("You withdrew" + amt + " and your balance is" + balance);
        }
    }

    public String getAccountnum() {
        return accountnum;
    }
}
