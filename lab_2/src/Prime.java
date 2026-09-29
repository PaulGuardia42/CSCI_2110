/*
Prime Solution
This class tests the code for Exercise1. It calls a method to
calculate the nth prime and prints information about running time.
*/

import java.util.*;

// Paul Guardia - B00821183

//      NOTE: under the dir graphs_and_outputs in the root folder is the calc time for the algorithm nthprime()
//      prime_numbers_calc_time.png

public class Prime{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputArray = new ArrayList<>();

//      I realize this has no error handling for non int inputs.
        while(scanner.hasNextInt()){
            int inputVal = scanner.nextInt();
            if(inputVal == 0){
                break;
            }
            inputArray.add(inputVal);
        }

        System.out.println("Output:");
        for(int num : inputArray){
           nthPrime(num);
        }

        System.out.println("Complete!");
    }

    public static long nthPrime(long n){

//      Start the clock
        long startTime = System.nanoTime();

//      We know that a prime number is a number that can only be divided by 1 and itself
        if(n == 1) return 2;

//      We start at primeNum = 3 as if n = 1 then the first prime is already handled above.
        long primeNum = 3;
        long counter = 1;

//      The naive test
        while(true){
            boolean isPrime = true;

//            I learned for j * j <= primeNum -> you only need to test divisors up to the square root
//            if a number has a bigger factor than sqrt(n), it also must have a smaller one than sqrt(n)
            for(long j = 2; j * j <= primeNum; j++){
                if(primeNum % j == 0){ // not a prime
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                counter++;
                if(counter == n) {
                    long endTime = System.nanoTime();
                    double executionTimeMs = (Math.round((endTime - startTime) / 1_000_000.0));
                    System.out.println(n + " " + primeNum + " " + executionTimeMs);
                    return primeNum;
                };
            }

            primeNum++;
        }

    }
}