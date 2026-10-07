import java.util.Scanner;

public class PointTester{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int intXPos = scanner.nextInt();
        int intYPos = scanner.nextInt();
        Point<Integer> point1 = new Point<Integer>(intXPos, intYPos);

        double doubleXPos = scanner.nextDouble();
        double doubleYPos = scanner.nextDouble();
        Point<Double> point2 = new Point<Double>(doubleXPos, doubleYPos);

        String stringXpos = scanner.next();
        String stringYpos = scanner.next();
        Point<String> point3 = new Point<String>(stringXpos, stringYpos);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }
}
