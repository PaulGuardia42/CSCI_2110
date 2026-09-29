/*
Binary Number Generation
This class tests the code for Exercise3. It calls a method that accepts a positive integer n
and generates binary numbers between 0 and 2^n -1. The main method prints information about
running time.
*/

// Paul Guardia - B00821183

import java.util.*;

public class Binary {
    public static void main(String[] args) {

//        Commenting out manual way, opting for a loop to make more calls at once.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a positive integer: ");
//        int intToBinary = scanner.nextInt();

        for(int i = 1; i < 26; i++){
            System.out.println("Enter a positive integer: " + i);
            generateBinary(i);
        }

    }

    public static void generateBinary(int n) {

        long startTime = System.nanoTime();

        int total = (int) (Math.pow(2,n));

//        Need to build a string of zeros for padding
        String zerosString = "";
        for(int i = 0; i < n; i++){
            zerosString += "0";
        }

        for(int i = 0; i < total; i++){
            String binaryOutput = Integer.toBinaryString(i);

//            adding the leading zeros
            binaryOutput = zerosString.substring(0, n - binaryOutput.length()) + binaryOutput;

//            render binary strings (Insanity test)
//            System.out.println(binaryOutput);
        }

        long endTime = System.nanoTime();
        double executionTimeMs = (endTime - startTime) / 1000000.0;

        /**
         * You will notice in the output.md table and the graphs_and_outputs/binary_calc_time.png image, the times fluctuate
         * eg: n = 12 takes 13 ms but n = 13 only takes 11 ms, I was reading there are a few reasons why this happens:
         * 1) what your computer is doing at the current moment (background processes, CPU speed / hardware, memory caches, etc.),
         * 2) JIT compilation (When I asked AI (Claude) it said: "Java starts out running your code slowly, one bytecode instruction at a time.
         * Once a loop has run about 10,000 times, the JVM compiles it into fast native machine code."),
         * 3) Garbage collection (java cleans up unused objects in bursts),
         * */

        System.out.println("The execution time to generate binary numbers from 0 to " +
                total + " is " + executionTimeMs + " ms");


    }
}