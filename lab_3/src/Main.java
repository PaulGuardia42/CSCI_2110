/*
* Student: Paul Guardia
* ID: B00821183
* */

import java.util.Random;

public class Main {



    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();


        Random random = new Random();

        for(int i = 0; i < 20; i++){
            int randomArraySize1 = random.nextInt(5000 - 10 + 1) + 10;  // 10 to 5000
            int[] array1 = new int[randomArraySize1];

            for(int j = 0; j < array1.length; j++){
                array1[j] = random.nextInt(100) + 1;
            }

            //prompt the user to enter the value of n
            // create an integer array of size n with random integers
            // the range of random integers is from 1 to n
            long startTime = System.nanoTime();

            // call to the bubble sort method
            bubbleSort.sort(array1);

            long endTime = System.nanoTime();
            double executionTimeMs = (endTime - startTime) / 1000000.0;
            //display the executionTime
            System.out.println("BubbleSort was executed in: " + executionTimeMs + "(ms) with array size of: " + array1.length);

        }

        System.out.println();

        for(int i = 0; i < 20; i++) {

            int randomArraySize2 = random.nextInt(5000 - 10 + 1) + 10;  // 10 to 5000
            int[] array2 = new int[randomArraySize2];

            for (int j = 0; j < array2.length; j++) {
                array2[j] = random.nextInt(100) + 1;
            }

            //prompt the user to enter the value of n
            // create an integer array of size n with random integers
            // the range of random integers is from 1 to n
            long startTime = System.nanoTime();

            // call to the selection sort method
            selectionSort.sort(array2);

            long endTime = System.nanoTime();
            double executionTimeMs = (endTime - startTime) / 1000000.0;

            //display the executionTime
            System.out.println("SelectionSort was executed in: " + executionTimeMs + "(ms) with array size of: " + array2.length);
        }
    }

}
