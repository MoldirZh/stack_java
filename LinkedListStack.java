package csci235;

/**
 * Generic stack implementation using a singly-Linked List
 *
 * @param <T>
 */
public class LinkedListStack<T> implements Stack<T> {

    class Node<T> {
        private T value;
        private Node link;

        public Node(T val) {
            value = val;
        }

        public T getValue() {
            return value;
        }

        public void setLink(Node next) {
            link = next;
        }

        public Node getLink() {
            return link;
        }
    }

    private Node<T> top;
    private int size;

    public LinkedListStack() {
        top = null;
        size = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node(value);

        newNode.setLink(top);
        top = newNode;

        size++;
    }

    public T peek() throws Exception {
        if (size == 0) {
            throw new Exception("Cannot peek on empty stack");
        }
        return top.getValue();
    }

    public void pop() throws Exception {
        if (size == 0) {
            throw new Exception("Stack is empty");
        }
        top = top.getLink();
        size--;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void clear() {
        top = null; //the remaining nods won't be referenced by anything else->free
        size = 0;
    }

    public String toString() {
        String result = "[";

        Node<T> curr = top;

        while (curr != null) {
            result += curr.getValue() + " ";
            curr = curr.getLink();
        }

        result += "]";
        return result;
    }
}
