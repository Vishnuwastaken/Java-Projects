import java.util.*;
// there is open day where parents have to meet teachers. There is parent node. Using Parent Node make linked list using object
public class Parent {
    private String name;
    private String phone;
    private boolean attended;
    private Parent next;
    public Parent (String aName, String aPhone)
    {
        this.name = aName;
        this.phone = aPhone;
        this.attended = false;
        this.next = null;
    }
    public String getName()
    {
        return this.name;
    }
    public String getParent()
    {
        return this.name+" "+this.phone;
    }
    public void setAttended()
    {
        attended = true;
    }
    public Parent getNext()
    {
        return this.next;
    }
    public void setNext(Parent nextNode)
    {
        this.next = nextNode;
    }
}
