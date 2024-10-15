import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileSort {
    private int numberofvalues;
    private double rating[];

    public FileSort(int numberofvalues){
        this.numberofvalues = numberofvalues;
        rating = new double[numberofvalues];


    }

   // csv file to array converter method
    public void csvread(String filename, int columnnum){
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null && i<numberofvalues) {
                String[] values = line.split(",");
                rating[i] = Double.parseDouble(values[columnnum]);
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
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
            L[i] = rating[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = rating[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) { // change to L[i] ">="R[j] for descending "<=" for ascending
                rating[k] = L[i];
                i++;
            }
            else {
                rating[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            rating[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            rating[k] = R[j];
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

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void mergeascending(int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        double L[] = new double[n1];
        double R[] = new double[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = rating[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = rating[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                rating[k] = L[i];
                i++;
            }
            else {
                rating[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            rating[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            rating[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sortascending(int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sortascending( l, m);
            sortascending(m + 1, r);

            // Merge the sorted halves
            mergeascending( l, m, r);
        }
    }

    public void display(){
        for (int i=0;i<numberofvalues;i++){
            System.out.print(rating[i] + " | ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        final int size = 1000; // to change
        FileSort ms = new FileSort(size);
        ms.csvread("/Users/vishnuv./Desktop/Java code 2/Java code 2/src/rating_csv.csv",2);
        // merge sort with random order data
        long start = System.nanoTime();
        ms.sort(0,size-1); // random data in descending
        long end = System.nanoTime();
        System.out.println("Time taken by merge sort for random data is: " + (end-start) + " nanoseconds");
        // merge sort with sorted order data
        long start1 = System.nanoTime();
        ms.sort(0,size-1); // descending to descending
        long end1 = System.nanoTime();
        System.out.println("Time taken by merge sort with sorted data is: " + (end1-start1) + " nanosecond");
        // merge sort with reversed data
        long start2 = System.nanoTime();
        ms.sortascending(0,size-1);
        long end2 = System.nanoTime();
        System.out.println("Time taken by merge sort with reversed is: " + (end2-start2) + " nanosecond");

    }
}
