package LinkedListprac;

import LinkedListprac.Student;

import java.util.*;
public class Mainclass{
    public static void display(ArrayList<Student> allStudents){
        for (int i=0;i< allStudents.size();i++){
            Student x = (allStudents.get(i));
            System.out.println(x.getRollnum());
            System.out.println(x.getName());
            System.out.println(x.getMarks());
            System.out.println();
        }
    }
    public static LinkedList<Student> convert(ArrayList<Student> allStudents){
        LinkedList<Student> l = new LinkedList<Student>();
        for (int i=0;i< allStudents.size();i++){
            Student x = allStudents.get(i);
            if (x.getMarks()>=75){
                l.add(x);
            }
        }
        return l;
    }
    // write a function that takes linked as a parameter and removes a student by name (takes name inputted by user and remove)
    public static void remove(LinkedList<Student> s, String name){
        boolean found = false;
        for (int i=0;i<s.size();i++){
            if (s.get(i).getName().equalsIgnoreCase(name) == true){
                s.remove(i);
                System.out.println(name + " removed");
                found = true;
                break;
            }
        }
        if(found == false) {
            System.out.println(name + " not found");
        }
    }

    public static void display1(LinkedList<Student> s){
        for (int i=0;i< s.size();i++){
            Student x = (s.get(i));
            System.out.println(x.getRollnum());
            System.out.println(x.getName());
            System.out.println(x.getMarks());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> allStudents = new ArrayList<Student>();
        Student s1 = new Student("Bob", 10, 84);
        Student s2 = new Student("Jim", 11, 12);
        Student s3 = new Student("Tom", 12, 75);
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);
        LinkedList<Student> top = convert(allStudents);
        display1(top);
        System.out.println(" Enter a name being removed for: ");
        String name = input.nextLine();
        remove(top, name);
        display1(top);
    }
}
