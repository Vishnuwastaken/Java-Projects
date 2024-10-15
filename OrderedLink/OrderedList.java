package OrderedLink;

public class OrderedList {
    private Node head;
    public OrderedList(){
        this.head = null;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if (head==null || head.data >= newNode.data){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null && current.next.data < newNode.data){
                current = current.next;
            }
        }
    }
    public void displayList(){
        Node current = head;
        while (current!=null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        OrderedList orderedList = new OrderedList();
        orderedList.insert(20);
        orderedList.insert(10);
        orderedList.insert(40);
        orderedList.insert(30);
        orderedList.insert(5);
        orderedList.displayList();
    }

}
