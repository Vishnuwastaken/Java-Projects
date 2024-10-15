package Schoollist;

public class Mainclass {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addToHead(10);
        myList.addToHead(20);
        myList.addToHead(30);

        myList.addToTail(5);
        myList.addToTail(15);

        myList.displayList();
    }
}
