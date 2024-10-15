public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");
        p1.greet();
        p2.greet();
        p1.setName("Charlie");
        p2.setName("Black");
        p1.greet();
    }
}
