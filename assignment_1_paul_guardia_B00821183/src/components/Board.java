package components;
import java.util.Arrays;

public class Board {

    private Piece[][] gameBoard;

    public Board(int dimensions){
        gameBoard = new Piece[dimensions][dimensions];
    }

    public Piece getPiece(int x, int y){
        if(x < 0 || x > 7 || y < 0 || y > 7){
            System.out.println("Out of bounds");
            return null;
        }
        if(gameBoard[x][y] == null){
            System.out.println("No Piece at this location");
            return null;
        }
        return gameBoard[x][y];
    }

//  Add a new Piece to the game board
    public void add(Piece piece){
        if(gameBoard[piece.getPosition()[0]][piece.getPosition()[1]] == null){
            gameBoard[piece.getPosition()[0]][piece.getPosition()[1]] = piece;
            System.out.println("Created: " + piece.toString());
        }else{
            System.out.println("There is already a Piece there!");
        }
    }

//  Move a Piece at a given location in a given direction by a given number of spaces. Display an error message
//  if the Piece cannot be moved.
    public void move(Piece piece, String direction, int n){
        int oldX = piece.getPosition()[0];
        int oldY = piece.getPosition()[1];

        if(piece.getClass() == SlowPiece.class){
            if(n > 1){
                System.out.println("This is a slow piece it cannot move more than 1 space at a time");
            }else{
                ((SlowPiece) piece).move(direction);
            }
        }else if (piece.getClass() == FastPiece.class){
            ((FastPiece) piece).move(direction, n);
        }else if (piece.getClass() == SlowFlexible.class){
            if(n > 1){
                System.out.println("This is a slow piece it cannot move more than 1 space at a time");
            }else{
                ((SlowFlexible) piece).move(direction);
            }
        }else if(piece.getClass() == FastFlexible.class){
            ((FastFlexible) piece).move(direction, n);
        }
        else{
            System.out.println("Invalid piece");
        }

        updateBoard(piece, oldX, oldY);
        System.out.println("Piece: " + piece.toString() + " - From: (" + oldX + "," + oldY +") -> (" + piece.getPosition()[0] + "," + piece.getPosition()[1] + ")");
    }

    public void updateBoard(Piece piece, int oldX, int oldY){
        gameBoard[oldX][oldY] = null;
        gameBoard[piece.getPosition()[0]][piece.getPosition()[1]] = piece;

    }

//  Display the game board, showing the name, color and type of each Piece on the game board at
//  its current location.
    public void display(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        for(Piece[] row : gameBoard){
            for(Piece cell : row){
                if(cell == null){
                    System.out.print(" [" + String.format("%-10.10s", "") + "] ");
                }else{
                    System.out.print(" [" + String.format("%-10.10s",cell.toString()) + "] ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }



}
