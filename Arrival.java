import java.util.*;
public class Arrival {
    private LinkedList<Flight> planes;
    public Arrival(){
        planes = new LinkedList<Flight>();
    }
    // add a flight to the beginning of the linked list
    public void addplane(Flight x){
        planes.addFirst(x);
    }
    public void display(){
        for (int i=0;i< planes.size();i++){
            System.out.println(planes.get(i).getId());
        }
    }
    // add a flight in ascending order
    public void addascending(Flight x){
        int i=0;
        while(i<planes.size() && x.getId().compareToIgnoreCase(planes.get(i).getId())>0){
            i++;
        }
        planes.add(i, x);
    }
    // pick up all SQ flights from planes list and create a new list only of them
    public LinkedList<Flight> SQ(){
        LinkedList<Flight> sqflights = new LinkedList<Flight>();
        for (int i=0;i<planes.size();i++){
            if (planes.get(i).getId().substring(0,2).equals("SQ")){
                Flight x = planes.remove(i);
                sqflights.add(x);
                i--;
            }
        }
        return sqflights;
    }
    public void mergeLists(LinkedList<Flight> merged){
        planes.addAll(merged);
    }

    public static void main(String[] args) {
        Arrival rkf = new Arrival();
        rkf.addascending(new Flight("SQ917"));
        rkf.addascending(new Flight("SQ959"));
        rkf.addascending(new Flight("MH370"));
        rkf.display();
        System.out.println();
        LinkedList<Flight> value = rkf.SQ();
        for (int i=0;i< value.size();i++){
            System.out.println(value.get(i).getId());
        }
        System.out.println();

        rkf.mergeLists(value);
        rkf.display();

    }
}
