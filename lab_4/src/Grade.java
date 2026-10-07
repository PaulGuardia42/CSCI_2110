public class Grade<T>{
    private T value;
    public Grade(T entry){
        value = entry;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T entry){
        value = entry;
    }
    public String toString(){
        return ""+value;
    }
}
