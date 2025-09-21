
import java.util.ArrayList;
import java.util.Scanner;

public class Queue {

    private ArrayList<Integer> queue = new ArrayList<>();

    public void enqueue(int x) {
        queue.add(x);
        System.out.println(" Enqueued: " + x + " (to the back)");
    }

    public Integer dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty — nothing to dequeue.");
            return null;
        }
        int v = queue.remove(0);
        System.out.println(" Dequeued: " + v);
        return v;
    }

    public void peek() {
        if (queue.isEmpty()) {
            System.out.println(" Queue is empty."); 
        }else {
            System.out.println("Front is: " + queue.get(0));
        }
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println(" Queue is empty."); 
        }else {
            System.out.println(" Queue (front → back): " + queue);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Queue Demo Started ");

        while (true) {
            System.out.println("\nChoose:");
            System.out.println("1) Enqueue");
            System.out.println("2) Dequeue");
            System.out.println("3) Peek");
            System.out.println("4) Display");
            System.out.println("5) Size");
            System.out.println("0) Exit");
            System.out.print(" Enter choice: ");

            int ch = sc.nextInt();
            if (ch == 0) {
                break;
            }

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter integer to enqueue: ");
                    int x = sc.nextInt();
                    q.enqueue(x);
                }
                case 2 ->
                    q.dequeue();
                case 3 ->
                    q.peek();
                case 4 ->
                    q.display();
                case 5 ->
                    System.out.println(" Size: " + q.queue.size());
                default ->
                    System.out.println(" Invalid choice, try again.");
            }
        }
        System.out.println(" Bye — queue finished.");
        sc.close();
    }
}
