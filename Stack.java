package csci235;

public interface Stack<T> {

    //Insert an item at the top of the stack
    void push(T val);

    //Returns the value of the topmost item of the stack
    //throws an exception if the stack is empty
    T peek() throws Exception;

    //Remove the value of the topmost item of the stack
    //throws an exception if the stack is empty
    void pop() throws Exception;

    //Remove everything from the stack
    void clear();

    //Returns the number of items in the stack
    int size();

    //Returns whether or not the current stack is empty
    boolean empty();
}
