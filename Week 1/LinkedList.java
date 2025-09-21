
import java.util.*;

public class LinkedList {

    private ArrayList<Integer> list = new ArrayList<>();

    void addFirst(int x) {
        list.add(0, x);
        System.out.println(" " + x + " added at start");
    }

    void addLast(int x) {
        list.add(x);
        System.out.println(" " + x + " added at end");
    }

    void remove(int x) {
        System.out.println(list.remove((Integer) x) ? " " + x + " removed" : " " + x + " not found");
    }

    void contains(int x) {
        System.out.println(list.contains(x) ? " " + x + " is present" : " " + x + " NOT found");
    }

    void display() {
        System.out.println(list.isEmpty() ? " List is empty" : "List: " + list);
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n1)addFirst  2)addLast  3)remove  4)contains  5)display  0)exit");
            int ch = sc.nextInt();
            if (ch == 0) {
                break;
            }
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter: ");
                    L.addFirst(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter: ");
                    L.addLast(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter: ");
                    L.remove(sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Enter: ");
                    L.contains(sc.nextInt());
                }
                case 5 ->
                    L.display();
                default ->
                    System.out.println(" Invalid choice");
            }
        }
        System.out.println(" Bye — Linked List demo finished.");
        sc.close();
    }
}
