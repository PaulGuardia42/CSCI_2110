package components;

public class FastPiece extends Piece{


    public FastPiece(String name, String colour, int[] position) {
        super(name, colour, position);
    }

    public void move(String direction, int n){
        int xPos = getPosition()[0];
        int yPos = getPosition()[1];

        if(direction.equalsIgnoreCase("left")) {
            if(yPos - n < 0 || yPos - n > 7){
                System.out.println("Illegal Move! Cant move left");
            }else{
                setPosition(new int[]{xPos, yPos - n});
                System.out.println("Moved left");
            }
        }else if (direction.equalsIgnoreCase("right")){
            if(yPos + n < 0 || yPos + n > 7){
                System.out.println("Illegal Move! Cant move right");
            }else{
                setPosition(new int[]{xPos, yPos + n});
                System.out.println("Moved right");
            }
        }else{
            System.out.println("Please enter either 'left' or 'right' ");
        }
    }

    @Override
    public String toString(){
        return getName() + " " + getColour() + " FP";
    }
}
