import java.lang.*;
import java.time.*;
import java.util.Random;

public class SortProduct {
    private int numberofvalues;
    private String productName [];
    public SortProduct(int numberofvalues){
        this.numberofvalues = numberofvalues;
        productName = new String[numberofvalues];
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // create an object of Random class
        Random random = new Random();
        for (int i =0;i<numberofvalues;i++){
            StringBuilder sb = new StringBuilder();
            int randomNumber = random.nextInt(22) + 7;



            for(int j = 0; j < randomNumber; j++) {

                // generate random index number
                int index = random.nextInt(alphabet.length());

                // get character specified by index
                // from the string
                char randomChar = alphabet.charAt(index);

                // append the character to string builder
                sb.append(randomChar);
            }
            productName[i] = sb.toString();

        }

    }
//    public void selectionSort() {
//
//        for (int step = 0; step < numberofvalues - 1; step++) {
//            int min_idx = step;
//
//            for (int i = step + 1; i < numberofvalues; i++) {
//
//                // To sort in descending order, change > to < in this line.
//                // Select the minimum element in each loop.
//                if (productName[i].compareToIgnoreCase(productName[min_idx]) <0) {
//                    min_idx = i;
//                }
//            }
//
//            // put min at the correct position
//            String temp = productName[step];
//            productName[step] = productName[min_idx];
//            productName[min_idx] = temp;
//        }
//    }
//    public void insertionSort() {
//
//        for (int step = 1; step < numberofvalues; step++) {
//            String key = productName[step];
//            int j = step - 1;
//
//            // Compare key with each element on the left of it until an element smaller than
//            // it is found.
//            // For descending order, change key<array[j] to key>array[j].
//            while (j >= 0 && key.compareToIgnoreCase(productName[j])<0) {
//                productName[j + 1] = productName[j];
//                --j;
//            }
//
//            // Place key at after the element just smaller than it.
//            productName[j + 1] = key;
//        }
//    }
    public void display(){
        for (int i=0;i<numberofvalues;i++){
            System.out.print(productName[i] + " | ");
        }
        System.out.println();
    }
int partition ( int start, int end)
{
    String pivot = productName[end]; // pivot element
    int i = (start - 1);

    for (int j = start; j <= end - 1; j++)
    {
        // If current element is smaller than the pivot
        if (productName[j].compareToIgnoreCase(pivot)<0)
        {
            i++; // increment index of smaller element
            String t = productName[i];
            productName[i] = productName[j];
            productName[j] = t;
        }
    }
    String t = productName[i+1];
    productName[i+1] = productName[end];
    productName[end] = t;
    return (i + 1);
}

    /* function to implement quick sort */
    void quick( int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
    {
        if (start < end)
        {
            int p = partition( start, end); //p is the partitioning index
            quick(start, p - 1);
            quick( p + 1, end);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        String L[] = new String[n1];
        String R[] = new String[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = productName[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = productName[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareToIgnoreCase(R[j]) <=0) {
                productName[k] = L[i];
                i++;
            }
            else {
                productName[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            productName[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            productName[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort( l, m);
            sort(m + 1, r);

            // Merge the sorted halves
            merge( l, m, r);
        }
    }

    // driver code
    public static void main(String args[]) {
        final int size = 10; // changing

        SortProduct qs = new SortProduct(size);
        SortProduct ms = new SortProduct(size);
//        qs.display();
        ms.display();

        LocalTime startTime = LocalTime.now();
        long start =System.currentTimeMillis();
        qs.quick(0,size-1);
        long end = System.currentTimeMillis();
//        qs.display();
//        System.out.println("The time taken by quick sort is: " + (end-start) + " milliseconds");
        long start1 = System.currentTimeMillis();
        ms.sort(0,size-1);
        long end1 = System.currentTimeMillis();
        ms.display();
        System.out.println("Time taken by merge sort is: " + (end1-start1) + " milliseconds");

//        ss.selectionSort();
        LocalTime endTime = LocalTime.now();
//        is.display();




    }
}
