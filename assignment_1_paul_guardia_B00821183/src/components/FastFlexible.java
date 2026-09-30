package components;

public class FastFlexible extends FastPiece{
    public FastFlexible(String name, String colour, int[] position) {
        super(name, colour, position);
    }

    public void move(String direction, int n){
        int xPos = getPosition()[0];
        int yPos = getPosition()[1];

        if(direction.equalsIgnoreCase("left")) {
            if(yPos - n < 0){
                System.out.println("Illegal Move!");
            }else{
                setPosition(new int[]{xPos, yPos - n});
                System.out.println("Moved left");
            }
        }else if (direction.equalsIgnoreCase("right")){
            if(yPos + n > 7){
                System.out.println("Illegal Move!");
            }else{
                setPosition(new int[]{xPos, yPos + n});
                System.out.println("Moved right");

            }
        }else if (direction.equalsIgnoreCase("up")){
            if(xPos - n < 0){
                System.out.println("Illegal Move!");
            }else{
                setPosition(new int[]{xPos - n, yPos});
                System.out.println("Moved up");

            }
        }else if (direction.equalsIgnoreCase("down")){
            if(xPos + n > 7){
                System.out.println("Illegal Move!");
            }else{
                setPosition(new int[]{xPos + n, yPos});
                System.out.println("Moved down");

            }
        }
        else{
            System.out.println("Please enter either 'left', 'right' or 'up,' 'down' ");
        }
    }

    @Override
    public String toString(){
        return getName() + " " + getColour() + " FF";
    }
}
