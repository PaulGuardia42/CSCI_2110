import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long value = scanner.nextInt();
        long count = 0;
        long sequenceLength = 0;
        for(int i = 0; i < value; i++){
            sequenceLength = collatzSequence(value);
            if(sequenceLength > count){
                count = sequenceLength;
            }
        }


        System.out.println("For n="+ value +", the starting number of the longest Collatz sequence is 3\n" +
                "and the length of the longest sequence is " + count + ".");

    }

    public static long collatzSequence(long value){
        long counter = 0;
//        System.out.print("The Collatz sequence for n = " + value + " is ");
        while(value != 1){
            value = evenOrOdd(value);
            if(value == 1) {
//                System.out.print(value);
            }
            else {
//                System.out.print(value + ", ");
                counter++;
            }
        }
        return counter;
    }

    public static long evenOrOdd(long n){
        if(n % 2 == 0){
            return n / 2;
        }
        else{
            return (n * 3) + 1;
        }
    }
}
