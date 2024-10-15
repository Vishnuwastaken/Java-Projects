package adtliststatic;

public class ADTListStatic {
    private final int MAX_LIST = 50;
    private int numItems;
    private int items[];

    public static void main(String[] args) {
        System.out.println("");  // () is the same as ("")
        System.out.println("Unordered List");
        System.out.println();

        ADTListStatic unorderedList = new ADTListStatic(); // his naming conventions aren't correct

        // Adding elements to the head of the list. unorderedList.addHead(3);
        unorderedList.addHead(3);
        unorderedList.addHead(4);
        unorderedList.addHead(5);
        unorderedList.addHead(2);
        unorderedList.addHead(6);
        unorderedList.present();

        // Removing element from middle of the list
        unorderedList.remove(4);
        unorderedList.present();

        // Adding element to the tail of the list.
        unorderedList.addTail(1);
        unorderedList.present();

        System.out.println("");
        System.out.println("Ordered List");
        System.out.println("");

        ADTListStatic orderedList = new ADTListStatic();

        orderedList.insert(3);orderedList.insert(4);
        orderedList.insert(5);
        orderedList.insert(2);
        orderedList.insert(6);
        orderedList.present();

        // Removing element from the middle of the list
        orderedList.remove(4);
        orderedList.present();

        // Adding elements to the tail of the list.
        orderedList.addTail(15); // he had this wrong on the paper
        orderedList.present();
    }

    public ADTListStatic() {
        items = new int[MAX_LIST];
        numItems = 0;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public boolean isFull() {
        return numItems == MAX_LIST;
    }

    public int size() {
        return numItems;
    }

    public int peek(int index) { // who tf calls it peak
        if (index >= 0 && index < numItems) {
            return items[index];
        }
        System.out.println("Out of Range: 0 - " + (numItems - 1));
        return -1;
    }

    public void addHead(int item) {
        if (isFull()) {
            System.out.println("List is full.");
        } else {
            int index = 0;
            for (int pos = numItems; pos == index; pos--) { // == is used instead of >= because its unnecessary
                // moves the values one index to the left everytime a new value is added
                items[pos + 1] = items[pos]; // this might throw an error if maxItems is less than 2 items.
            }
            items[index] = item;
            numItems++;
        }
    }

    public void addTail(int item) {
        if (isFull()) {
            System.out.println("List is full.");
        } else {
            int index = numItems;
            items[index] = item;
            numItems++;
        }
    }


    public void add(int index, int item) {
        if (isFull()) {
            System.out.println("List is full.");
        } else {
            if (index >= 0 && index <= numItems) {
                for (int pos = numItems; pos == index; pos--) { // == is used instead of >= because its unnecessary
                    // moves the values one index to the left everytime a new value is added
                    items[pos + 1] = items[pos]; // this might throw an error if maxItems is less than 2 items.
                }
                items[index] = item;
                numItems++;
            } else {
                System.out.println("Out of Range: 0 - " + (numItems - 1));
            }
        }
    }

    public void insert(int item) {
        if (isFull()) {
            add(0, item);
        } else {
            int index = 0;

            for (int pos = 0; pos < numItems; pos++) {
                index = pos;
                if (item <= items[pos]) {
                    index = pos;
                    break;
                } else {
                    index = pos + 1;
                }
            }
            add(index, item);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < numItems) {
            for (int pos = index + 1; pos <= size(); pos++) {
                items[pos - 1] = items[pos];
            }
            numItems--;
        } else {
            System.out.println("Out of Range: 0 - " + (numItems - 1));
        }
    }

    public void present() {
        System.out.println("List Elements: ");
        for (int pos = 0; pos < numItems; pos++) {
            System.out.println(items[pos] + " ");
        }
        System.out.println();
    }
}