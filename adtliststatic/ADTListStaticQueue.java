package adtliststatic;

public class ADTListStaticQueue {
    private ADTListStatic list;
    public ADTListStaticQueue(){
        list = new ADTListStatic();
    }
    public void insert(int item){
        list.addTail(item);
    }
    public int remove(){
        int item = peek();
        list.remove(0);
        return item;
    }
    public int peek(){
        return list.peek(0);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int size(){
        return list.size();
    }

    public static void main(String[] args) {
        ADTListStaticQueue queue = new ADTListStaticQueue();
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        System.out.println("first element is: " + queue.peek());
        System.out.println("removing first element is: " + queue.remove());
        System.out.println("first element is now: " + queue.peek());

    }
}
