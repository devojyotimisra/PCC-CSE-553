
import java.util.*;

public class BST {

    private TreeSet<Integer> bst = new TreeSet<>();

    void insert(int x) {
        System.out.println(bst.add(x) ? " " + x + " inserted" : " " + x + " already exists");
    }

    void delete(int x) {
        System.out.println(bst.remove(x) ? " " + x + " deleted" : " " + x + " not found");
    }

    void search(int x) {
        System.out.println(bst.contains(x) ? " " + x + " found" : " " + x + " NOT found");
    }

    void display() {
        System.out.println(bst.isEmpty() ? " BST empty" : " In-order: " + bst);
    }

    public static void main(String[] args) {
        BST b = new BST();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n1)insert  2)delete  3)search  4)display  0)exit");
            int ch = sc.nextInt();
            if (ch == 0) {
                break;
            }
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter: ");
                    b.insert(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter: ");
                    b.delete(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter: ");
                    b.search(sc.nextInt());
                }
                case 4 ->
                    b.display();
                default ->
                    System.out.println(" Invalid choice");
            }
        }
        System.out.println(" Bye — BST demo finished.");
        sc.close();
    }
}
