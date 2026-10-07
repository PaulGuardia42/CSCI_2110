package GenericStack;
import java.util.Scanner;

public class GenericStackTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GenericStack<String> stackS = new GenericStack<String>();
        GenericStack<Integer> stackI = new GenericStack<Integer>();

        // ---------- Strings section ----------
        System.out.println("Enter strings to PUSH (one per line). Press Enter on an empty line to finish:");
        while(true){
            String data = sc.nextLine();

        // read lines until a blank line; push each non-empty line
            if(data.isEmpty()){
                break;
            }

            // onto stackS
            stackS.push(data);
        }

        // TODO: print "Stack<String> size: X"
        System.out.println("Stack<String> size: " + stackS.size());
        // TODO: if not empty, print "Peek<String>: <top>"
        System.out.println("Peek<String>: " + stackS.peek());

        System.out.println("Popping all String items (LIFO):");
        // TODO: pop and print each item on one line, space-separated
        while(!stackS.isEmpty()){
            System.out.print(stackS.pop() + " ");
        }
        System.out.println();

        // TODO: print "Stack<String> empty? true/false"
        System.out.println("Stack<String> empty? " + stackS.isEmpty());


        // ---------- Integers section ----------
        System.out.println("\nEnter integers to PUSH (one per line). Press Enter on an empty line to finish:");
        // TODO: read lines; for each non-empty line, parse to int and push
        //onto stackI
        // TODO: print "Stack<Integer> size: X"
        // TODO: if not empty, print "Peek<Integer>: <top>"
        System.out.println("Popping all Integer items (LIFO):");
        // TODO: pop and print each item on one line, space-separated
        // TODO: print "Stack<Integer> empty? true/false"
    }
}
