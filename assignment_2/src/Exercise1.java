import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long value = scanner.nextInt();

        System.out.print("The Collatz sequence for n = " + value + " is ");
        while(value != 1){
            value = evenOrOdd(value);
            if(value == 1) System.out.print(value);
            else System.out.print(value + ", ");
        }

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
