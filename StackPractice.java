import java.util.Stack;
import java.util.*;

// create stack of integers
public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<Integer>();
        Scanner input = new Scanner(System.in);
        int num;
        char choice;
        do {
            System.out.println("Enter number: ");
            num = input.nextInt();
            numbers.push(num);
            System.out.println("Press y to continue, else any key to exit: ");
            choice = input.next().charAt(0);
        } while (choice == 'y');
        while (numbers.isEmpty()==false){
            System.out.println(numbers.pop());
        }
    }
}
