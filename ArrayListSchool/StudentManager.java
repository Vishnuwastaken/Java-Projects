package ArrayListSchool;
import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student> studentList;
    public StudentManager(){
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public boolean removeStudent(Student student){
        return studentList.remove(student);
    }
    public Student getStudent(int index){
        if (index>=0 && index < studentList.size()){
            return studentList.get(index);
        }
        return null;
    }
    public void iterateStudents(){
        for (Student student : studentList){
            System.out.println(student);
        }
    }
    public int getSize(){
        return studentList.size();
    }
}
