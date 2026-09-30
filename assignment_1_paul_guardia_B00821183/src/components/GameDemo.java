package components;

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


public class GameDemo {
    Scanner scanner = new Scanner(System.in);

    public void startGame(){

        Board board = new Board(8);
        boolean gameRunning = true;
        try {
            String header = Files.readString(Path.of("src/components/header.txt"));
            System.out.println(header);
        } catch (IOException e) {
            System.out.println("Could not load header");
        }


//        Game will run until exit is input into command line
        while(gameRunning){
            System.out.println("Enter a command (type help for details): ");
            String command = scanner.nextLine();

//            Storing the command into an array, if there are multiple arguments divided by spaces.
//            We can now use the switch conditional to use the first part of the array (index 0)
            String[] parts = command.trim().split(" ");

            switch (parts[0]){
                case "help":
                    System.out.println("create x y [fast] [flexible] -> creates a Piece at [x, y]. Defaults to slow and nonflexible.");
                    System.out.println("move x y direction [spaces] -> moves the Piece at [x, y] left, right, up or down (up/down need a flexible Piece, spaces needs a fast Piece).");
                    System.out.println("print –> Display the board");
                    System.out.println("exit –> Exit the game.");
                    break;

                case "create":
                        create(parts,board);
//                        Personal decision to render the display after making a change or creating something,
//                        gives the user some feedback that the piece was created and is on the board.
                        board.display();
                    break;

                case "move":
                        move(parts,board);
                        board.display();
                    break;

                case "print":
                    board.display();
                    break;

                case "exit":
                    System.out.println("Goodbye!");
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid command");

            }
        }

    }


    public void create(String[] parts, Board board){
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("Enter a color: ");
        String color = scanner.nextLine();

        int commandLength = parts.length;

        switch (commandLength){
            case 3:
                SlowPiece SlowPiece = new SlowPiece(
                        name,
                        color,
                        new int[]{Integer.parseInt(parts[1]), Integer.parseInt(parts[2])}
                );
                board.add(SlowPiece);
                break;
            case 4:
                if(parts[3].equalsIgnoreCase("slow")){
                    SlowPiece slowPiece = new SlowPiece(
                            name,
                            color,
                            new int[]{Integer.parseInt(parts[1]), Integer.parseInt(parts[2])}
                    );
                    board.add(slowPiece);
                }

                if(parts[3].equalsIgnoreCase("fast")){
                    FastPiece fastPiece = new FastPiece(
                            name,
                            color,
                            new int[]{Integer.parseInt(parts[1]), Integer.parseInt(parts[2])}
                    );
                    board.add(fastPiece);
                }
                break;
            case 5:
                if(parts[3].equalsIgnoreCase("slow") &&
                        parts[4].equalsIgnoreCase("flexible")){
                    SlowFlexible slowFlexible = new SlowFlexible(
                            name,
                            color,
                            new int[]{Integer.parseInt(parts[1]), Integer.parseInt(parts[2])}
                    );
                    board.add(slowFlexible);
                }

                if(parts[3].equalsIgnoreCase("fast") &&
                        parts[4].equalsIgnoreCase("flexible")){
                    FastFlexible fastFlexible = new FastFlexible(
                            name,
                            color,
                            new int[]{Integer.parseInt(parts[1]), Integer.parseInt(parts[2])}
                    );
                    board.add(fastFlexible);
                }
                break;
        }
    }

    public void move(String[] parts, Board board){
        //                    Breaking the array into variables, I could avoid the variables all together, but did this for
//                    readability and for my own tracking and conceptualization.
        int xPos = Integer.parseInt(parts[1]);
        int yPos = Integer.parseInt(parts[2]);
        String direction = parts[3];
        Piece piece = board.getPiece(xPos,yPos);

        if(parts.length > 4){
//                        If there is a steps argument it will be processed here
            int steps = Integer.parseInt(parts[4]);
            board.move(piece, direction, steps);
        }else{
//                        Steps is 1 (Slow Piece and Slow Flexible)
            board.move(piece, direction, 1);
        }
    }

}
