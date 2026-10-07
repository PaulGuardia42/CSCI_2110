public class Point<T> {
    private T xpos;
    private T ypos;

    public Point(T xpos, T ypos){
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public String toString(){
        return "XPOS: " +  xpos + " YPOS: " + ypos;
    }

    public T getXPos(){
        return xpos;
    }

    public T getYPos(){
        return ypos;
    }

    public void setXPos(T data){
        this.xpos = data;
    }

    public void setYPos(T data){
        this.ypos = data;
    }
}
