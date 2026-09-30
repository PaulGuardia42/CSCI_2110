/*
 * Student: Paul Guardia
 * ID: B00821183
 * */

import java.util.*;

public class BubbleSort{

    public int[] sort(int[] arr){
        // sort and return the integer arr of size n

//        display(arr);
        int swap;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                     swap = arr[j + 1];

                     arr[j + 1] = arr[j];
                     arr[j] = swap;
                }
            }
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