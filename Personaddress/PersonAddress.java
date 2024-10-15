package Personaddress;


public class PersonAddress {
    private String name;
    private int age;
    private Address address;

    public PersonAddress(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFullAddress(){
        return address.getStreet() + " , " + address.getCity() + " , " + address.getState() + " " + address.getZipCode();
    }

    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA", "12345");
        PersonAddress person = new PersonAddress("John Doe", 30, address);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Full Address: " + person.getFullAddress());

    }
}
