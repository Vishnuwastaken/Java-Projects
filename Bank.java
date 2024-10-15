// write functions to add customer, delete customer, display all customer, display a specific customer
import java.util.*;
import java.lang.*;

public class Bank {
    static Scanner input = new Scanner(System.in);
    final static int upper = 9999;
    final static int lower = 1000;
    private Account customers[];
    private int no_customers;
    public Bank(){
        customers = new Account[10];
        no_customers = 0;
    }
    public void addcustomer(){
        System.out.println("Enter customer name: ");
        String name = input.nextLine();
        System.out.println("Enter amount to deposit: ");
        float balance = input.nextFloat();
        input.nextLine();
        int n =(int)(Math.random()*(upper-lower)+lower);
        String num = String.valueOf(n);
        System.out.println("Account number: " + num);
        Account c = new Account(num, name, balance);
        customers[no_customers] = c;
        no_customers++;
    }
    public void displayall(){
        for (int i=0; i<no_customers;i++){
            System.out.println(customers[i]);
        }
    }

    public int search(){
        System.out.println("Enter account number: ");
        String accountnum = input.nextLine();
        boolean found = false;
        int i=0;
        while (i<no_customers && found == false){
            if (accountnum.equalsIgnoreCase(customers[i].getAccountnum())){
                found = true;
                return i;
            }
            i++;
        }
        return -1;
    }
    public void specific(){
            int index = search();
            if (index == -1){
                System.out.println("Account Not found");
            }
            else {
                System.out.println(customers[index]);
            }
        }
    public void delete(){
        int index = search();
        if (index == -1){
            System.out.println("Account Not found");
        }
        else {
            for (int i=index; i<no_customers;i++){
                customers[i]=customers[i+1];
            }
            no_customers--;

        }
    }
}
// write a function to display a specific account displayed from the user
