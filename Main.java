import java.util.Random;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Bank mybank = new Bank();
//        int choice=0;
//        do {
//            System.out.println("Option 1 to add a customer: ");
//            System.out.println("Option 2 to display all customers: ");
//            System.out.println("Option 3 to display a specific user");
//            System.out.println("Option 4 to del");
//            System.out.println("Option 5 to exit");
//
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice ==1){
//                mybank.addcustomer();
//            }
//            else if (choice==2){
//                mybank.displayall();
//            }
//            else if (choice==3){
//                mybank.specific();
//            }
//            else if(choice==4){
//                mybank.delete();
//            }
//            else if(choice == 5){
//                System.out.println("Goobye");
//            }
//            else {
//                System.out.println("Invalid choice");
//            }
//        }while (choice!=5);

        Random random = new Random();
        int randomNumber = random.nextInt(22) + 7;
        System.out.print(randomNumber);

    }
}