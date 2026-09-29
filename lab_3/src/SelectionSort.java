
/*
Selection Sort
This class tests the code for Lab3: Exercise2. It calls the sort method to
sort an array of size n and prints information about running time.
*/
import java.util.*;
public class SelectionSort {


    public int[] sort(int[] arr) {
    // sort and return the integer arr of size n
        int currentMin;
        int currentItem;
        int swap;

        display(arr);

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){

            }
        }
        display(arr);
        return arr;
    }


    public void display(int[] arr){
        //        Display Array
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}