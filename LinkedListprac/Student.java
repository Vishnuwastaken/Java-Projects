package LinkedListprac;// Write a class student, with properties name, roll number, marks
// Create an array list of students (allStudents)
// From the array list above, create a linked list called Plus75 with marks > 75
import java.util.*;
public class Student {
    private String name;
    private int rollnum;
    private float marks;
    public Student(String name, int rollnum, float marks){
        this.name = name;
        this.rollnum = rollnum;
        this.marks = marks;
    }
    public float getMarks() {
        return marks;
    }
    public int getRollnum() {
        return rollnum;
    }
    public String getName() {
        return name;
    }
    public void setMarks(float marks){
        this.marks = marks;
    }

}
