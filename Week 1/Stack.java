
import java.util.ArrayList;
import java.util.Scanner;

public class Stack {

    private ArrayList<Integer> stack = new ArrayList<>();

    void push(int x) {
        stack.add(x);
    }

    Integer pop() {
        return stack.isEmpty() ? null : stack.remove(stack.size() - 1);
    }

    Integer peek() {
        return stack.isEmpty() ? null : stack.get(stack.size() - 1);
    }

    void display() {
        System.out.println(stack.isEmpty() ? "Stack is empty." : stack);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n1)push  2)pop  3)peek  4)display  5)size  0)exit → ");
            int ch = sc.nextInt();
            if (ch == 0) {
                break;
            }
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                }
                case 2 ->
                    System.out.println("Popped: " + s.pop());
                case 3 ->
                    System.out.println("Top: " + s.peek());
                case 4 ->
                    s.display();
                case 5 ->
                    System.out.println("Size: " + s.stack.size());
                default ->
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
