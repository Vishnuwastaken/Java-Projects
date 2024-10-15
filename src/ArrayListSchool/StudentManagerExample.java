package ArrayListSchool;

public class StudentManagerExample {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Alice", 20, "A"));
        manager.addStudent(new Student("Bob", 21, "B"));
        manager.addStudent(new Student("Charlie", 19, "A"));

        System.out.println("Students: ");
        manager.iterateStudents();

        Student studentToRemove = manager.getStudent(1);
        if (studentToRemove != null){
            boolean removed = manager.removeStudent(studentToRemove);

            if (removed){
                System.out.println("\nStudent removed successfuly");
            }
            else{
                System.out.println("\n Student removal failed.");
            }
        }
        System.out.println("\nSize of student list: " + manager.getSize());

    }
}
