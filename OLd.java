import java.lang.*;
import java.time.*;

public class OLd {
    private int numberofvalues;
    private double price[];
    public OLd(int numberofvalues){
        this.numberofvalues = numberofvalues;
        price = new double[numberofvalues];
        for (int i =0;i<numberofvalues;i++){
            double actualprice = Math.random();
            actualprice = 1+Math.random()*(5-1); // for 1-10k, 1+Math.random()*(10000-1)
            price[i] = Math.round(actualprice*1.0)/1.0; // change to (actualprice*100.0)/100.0 for price

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
//                if (price[i] < price[min_idx]) {
//                    min_idx = i;
//                }
//            }
//
//            // put min at the correct position
//            double temp = price[step];
//            price[step] = price[min_idx];
//            price[min_idx] = temp;
//        }
//    }
//    public void insertionSort() {
//
//        for (int step = 1; step < numberofvalues; step++) {
//            double key = price[step];
//            int j = step - 1;
//
//            // Compare key with each element on the left of it until an element smaller than
//            // it is found.
//            // For descending order, change key<array[j] to key>array[j].
//            while (j >= 0 && key < price[j]) {
//                price[j + 1] = price[j];
//                --j;
//            }
//
//            // Place key at after the element just smaller than it.
//            price[j + 1] = key;
//        }
//    }
    // Quick sort
    int partition ( int start, int end)
    {
        double pivot = price[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (price[j] > pivot)
            {
                i++; // increment index of smaller element
                double t = price[i];
                price[i] = price[j];
                price[j] = t;
            }
        }
        double t = price[i+1];
        price[i+1] = price[end];
        price[end] = t;
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
        double L[] = new double[n1];
        double R[] = new double[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = price[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = price[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                price[k] = L[i];
                i++;
            }
            else {
                price[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            price[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            price[k] = R[j];
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

    public void display(){
        for (int i=0;i<numberofvalues;i++){
            System.out.print(price[i] + " | ");
        }
        System.out.println();
    }

    // driver code
    public static void main(String args[]) {
        final int size = 1000; // 150k cap
        OLd qs = new OLd(size);
        // timing the quick sort with random order data
        LocalTime startTime = LocalTime.now();
        long start =System.nanoTime();
        qs.quick(0,size-1);
        long end = System.nanoTime();
        System.out.println("The time taken by quick sort for random data is: " + (end-start) + " milliseconds");
        // timing the quick sort with sorted data
//        qs.display();
        LocalTime startTime1 = LocalTime.now();
        long start1 =System.nanoTime();
        qs.quick(0,size-1);
        long end1 = System.nanoTime();
//        qs.display();
        System.out.println("The time taken by quick sort with sorted data is: " + (end1-start1) + " milliseconds");
        // timing with reversed data
        qs.sort(0,size-1); // sorted using merge sort for reversed data
//        qs.display(); // display of ascending
        LocalTime startTime2 = LocalTime.now();
        long start2 =System.nanoTime();
        qs.quick(0,size-1); // sort descending
        long end2 = System.nanoTime();
        System.out.println("The time taken by quick sort with reversed data is: " + (end2-start2) + " milliseconds");
//        qs.display();











//
    }
}
