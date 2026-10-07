package GenericStack;

import java.util.ArrayList;
public class GenericStack<T> {
    private ArrayList<T> stack;
//TODO – complete the rest of the code with the above methods

    // Creates an empty GenericStack object
    public GenericStack(){
        stack = new ArrayList<>();
    }

//    Returns the number of elements in the GenericStack
    public int size(){
        return stack.size();
    }

//    Removes and returns the top element in the GenericStack
    public T pop(){
        return stack.removeFirst();
    }

//    Returns the top element in the GenericStack (doesn’t remove it)
    public T peek(){
        return stack.getFirst();
    }

//        Adds an element to the top of the GenericStack
    public void push(T element){
        stack.addFirst(element);
    }

//    Returns true if the GenericStack is empty, false otherwise
    public boolean isEmpty(){
        return stack.isEmpty();
    }


}
