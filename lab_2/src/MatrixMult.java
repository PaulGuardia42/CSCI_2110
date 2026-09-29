
import java.util.*;

// Paul Guardia - B00821183

public class MatrixMult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//      Calculating 10 matrix multiplications (instead of doing it by hand)
//      These are completely random which means that I am going to use a scatter plot (found in dir graphs_and_outputs)
//      I am fitting this scatter plot with an exponential trend line to reveal the trajectory
        for(int i = 2; i < 10; i++){
            System.out.println("Enter the matrix size and the matrix element:");
            int matrixDimensions = random.nextInt(1000) + 1;
            int matrixValue = random.nextInt(100) + 1;
            System.out.println(matrixDimensions + " " + matrixValue);

            long[][] matrixArrayC = multiply(matrixDimensions, matrixValue);

        }


//        System.out.println("Enter the matrix size and the matrix element:");
//        int matrixDimensions = scanner.nextInt();
//        int matrixValue = scanner.nextInt();
//
//        long[][] matrixArrayC = multiply(matrixDimensions, matrixValue);

//        render(matrixDimensions, matrixArrayC);

    }


//        Render to make sure it works. (Insanity Testing)
    public static void render(int matrixDimensions, long[][] matrixArrayC){
        for(int i = 0; i < matrixDimensions; i++){
            for(int j = 0; j < matrixDimensions; j++){
                System.out.print(matrixArrayC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static long[][] multiply(int matrixDimensions, int matrixValue){
        //        instantiate the int matrix
        int[][] matrixArrayA = new int[matrixDimensions][matrixDimensions];
        int[][] matrixArrayB = new int[matrixDimensions][matrixDimensions];

//        We are using long here at the type because we might get enormus values in each cell.
//        say we had n = 10_000 and the values inside were 1000, this would far exceed the int
//        max value and give us a wrap around value (not what we are looking for)
        long[][] matrixArrayC = new long[matrixDimensions][matrixDimensions];

//        fill in the matrices with the value
        for(int[] row : matrixArrayA){
            Arrays.fill(row, matrixValue);
        }
        for(int[] row : matrixArrayB){
            Arrays.fill(row, matrixValue);
        }

//        I am consciously avoiding counting the matrix "fill" time
        long startTime = System.nanoTime();

//        Multiply A and B together
        for(int i = 0; i < matrixDimensions; i++){
            for(int j = 0; j < matrixDimensions; j++){
                long sum = 0;
                for(int k = 0; k < matrixDimensions; k++){
                    sum += (long) matrixArrayA[i][k] * matrixArrayB[k][j];
                }
                matrixArrayC[i][j] = sum;
            }
        }

//        Calc end time
        long endTime = System.nanoTime();
        double executionTimeMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Size:" + matrixDimensions + " Time:" + executionTimeMs + " ms");

        return matrixArrayC;

    }


}
