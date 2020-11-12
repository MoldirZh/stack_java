package csci235;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stk = new LinkedListStack();

        for (int i = 22; i < 200; i = i + 10) {
            stk.push(i);
        }

        System.out.println(stk);
        System.out.println("size: " + stk.size());
    }
}
