import java.util.LinkedList;

public class ParentList {
    Parent root;

    // default constructor
    public void addLast(Parent visitor) {
        Parent temp = root;
        if (root==null){
            root=visitor;
        }
        else{
            while(temp.getNext()!=null){
                temp= temp.getNext();
            }
            temp.setNext(visitor);
        }

// … adds visitor to the end of the list – missing code …
    }
    public void display(){
        Parent temp = root;
        while(temp!=null){
            System.out.println(temp.getName());
            temp =temp.getNext();
        }
    }

    public Parent removeFirst() {
        Parent value = null;
        if (root!=null){
            value = root;
            root = root.getNext();
        }
        else {
            System.out.println("Empty list");
        }
        return value;
    }
    public int size1(){
        int count =0;
        Parent temp = root;
        while(temp!=null){
            count+=1;
            temp = temp.getNext();
        }
        return count;
    }

    public Parent removeParent(int n) {
        Parent temp = root;
        if (size1()<n){
            temp = null;
            System.out.println("Value too large");
        }
        else if (n==1){
            temp = removeFirst();
        }
        else {
            int count=1;
            Parent prev = null;
            Parent current=root;
            while (count!=n){
                prev = current;
                current = current.getNext();
                count++;
            }
            temp = current;
            prev.setNext(current.getNext());
        }
        return temp;
    }

    public static void main(String[] args) {
        ParentList pl = new ParentList();
        pl.addLast(new Parent("Bob", "09078"));
        Parent x = new Parent("Rk", "033534");
        Parent y = new Parent("Jim", "5252525");
        Parent z = new Parent("Me", "35252");
        pl.addLast(x);
        pl.addLast(y);
        pl.addLast(z);
        pl.display();
        pl.removeParent(3);
        pl.display();

    }
}
