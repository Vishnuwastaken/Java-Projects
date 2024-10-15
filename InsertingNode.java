import java.util.*;

class Node{
    int x;
    Node next;
    public Node(int x){
        this.x=x;
        next = null;
    }
}
public class InsertingNode {
    public static void display(LinkedList<Node> nodes){
        Node temp = nodes.getFirst();
        int index =0;
        while (index< nodes.size()){
            temp = nodes.get(index);
            System.out.println(temp.x);
            index++;
        }
    }
    public static void orderedAdd(LinkedList<Node> nodes, Node n){
        Node temp = nodes.getFirst();
        int index =0;
        boolean found = false;
        while (index < nodes.size()){
            if (temp.x<n.x){
                index++;
                temp = nodes.get(index-1);
            }
            else {
                found = true;
                break;
            }
        }
        if (found==true){
            nodes.add(index,n);
        }
        else{
            nodes.addLast(n);
        }
    }


    public static void main(String[] args) {
        LinkedList<Node> l = new LinkedList<>();
        Node first = new Node(7);
        l.add(first);
        l.add(new Node(39));
        Node second = new Node(3);
        display(l);
        orderedAdd(l, second);
        display(l);


    }

}
