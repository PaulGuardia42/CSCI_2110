package components;

public class SlowFlexible extends SlowPiece{
    public SlowFlexible(String name, String colour, int[] position) {
        super(name, colour, position);
    }

    public void move(String direction){
        int xPos = getPosition()[0];
        int yPos = getPosition()[1];

        if(direction.equalsIgnoreCase("left")) {
            if(yPos - 1 < 0){
                System.out.println("Illegal Move! Cant move left");
            }else{
                setPosition(new int[]{xPos, yPos - 1});
                System.out.println("Moved left");
            }
        }else if (direction.equalsIgnoreCase("right")){
            if(yPos + 1 > 7){
                System.out.println("Illegal Move! Cant move right");
            }else{
                setPosition(new int[]{xPos, yPos + 1});
                System.out.println("Moved right");

            }
        }else if (direction.equalsIgnoreCase("up")){
            if(xPos - 1 < 0){
                System.out.println("Illegal Move! Cant move up");
            }else{
                setPosition(new int[]{xPos - 1, yPos});
                System.out.println("Moved up");

            }
        }else if (direction.equalsIgnoreCase("down")){
            if(xPos + 1 > 7){
                System.out.println("Illegal Move! Cant move down");
            }else{
                setPosition(new int[]{xPos + 1, yPos});
                System.out.println("Moved down");

            }
        }
        else{
            System.out.println("Please enter either 'left', 'right' or 'up,' 'down' ");
        }
    }

    @Override
    public String toString(){
        return getName() + " " + getColour() + " SF";
    }
}
