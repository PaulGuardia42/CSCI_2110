
/*
Selection Sort
This class tests the code for Lab3: Exercise2. It calls the sort method to
sort an array of size n and prints information about running time.
*/

/*
 * Student: Paul Guardia
 * ID: B00821183
 * */

import java.util.*;
public class SelectionSort {


    public int[] sort(int[] arr) {
    // sort and return the integer arr of size n
        int currentMinIndex = 0;
        int currentItem;
        int temp;

//        display(arr);

        for(int i = 0; i < arr.length - 1; i++){
            currentItem = arr[i];
            currentMinIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(currentItem > arr[j]){
                    currentMinIndex = j;
                    currentItem = arr[j];
                }
            }
            temp = arr[i];
            arr[i] = arr[currentMinIndex];
            arr[currentMinIndex] = temp;
        }
//        display(arr);
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