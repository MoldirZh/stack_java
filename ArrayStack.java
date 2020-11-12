package csci235;

public class ArrayStack<T> implements Stack<T>{

    private T[] values;
    private int stack_size;

    //Create an empty stack
    public ArrayStack() {
        values = (T[])(new Object[10]);
        stack_size = 0;
    }

    //Insert an item at the top of the stack
    public void push(T val) {
        if (stack_size == values.length) {
            T[] new_vals = (T[])(new Object[values.length * 2]);
            for (int i = 0; i < values.length; i++) {
                new_vals[i] = values[i];
            }
            values = new_vals;
        }
        values[stack_size] = val;
        stack_size++;
    }

    //Returns the value of the topmost item of the stack
    //throws an exception if the stack is empty
    public T peek() throws Exception {
        if (stack_size == 0) {
            throw new Exception("Cannot peek on empty stack");
        }
        return values[stack_size - 1];
    }

    //Remove the value of the topmost item of the stack
    //throws an exception if the stack is empty
    public void pop() throws Exception {
        if (stack_size == 0) {
            throw new Exception("Cannot pop on empty stack");
        }
        values[stack_size - 1] = null;
        stack_size--;
    }

    //Remove everything from the stack
    public void clear() {
        values = (T[])(new Object[values.length]);
        stack_size = 0;
    }

    //Returns the number of items in the stack
    public int size() {
        return stack_size;
    }

    //Returns whether or not the current stack is empty
    public boolean empty() {
        return stack_size == 0;
    }

    public String toString() {
        String result = "[";
        if (stack_size > 0) {
            result = result + values[0];
        }
        for (int i = 1; i < stack_size; i++) {
            result = result + ", " + values[i];
        }
        return result + "]";
    }
}
