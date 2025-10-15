package ex01;

public class Linked_List_Ex_01 {
    public static void main(String[] args) {
        System.out.println("Creating a new Linked List...");
        Linked_List list = new Linked_List();

        System.out.println("\n--- Testing Insertion ---");
        System.out.println("Appending 10, 20, 30...");
        list.append(10);
        list.append(20);
        list.append(30);
        System.out.print("List: ");
        list.print_list(); // Expected: 10 -> 20 -> 30 -> null

        System.out.println("\nPrepending 5...");
        list.prepend(5);
        System.out.print("List: ");
        list.print_list(); // Expected: 5 -> 10 -> 20 -> 30 -> null

        System.out.println("\nInserting 15 at position 2...");
        list.insert_at(2, 15);
        System.out.print("List: ");
        list.print_list(); // Expected: 5 -> 10 -> 15 -> 20 -> 30 -> null

        System.out.println("\n--- Testing Deletion ---");
        System.out.println("Deleting by value (10)...");
        list.delete_by_value(10);
        System.out.print("List: ");
        list.print_list(); // Expected: 5 -> 15 -> 20 -> 30 -> null

        System.out.println("\nDeleting at position 3...");
        list.delete_at(3);
        System.out.print("List: ");
        list.print_list(); // Expected: 5 -> 15 -> 20 -> null

        System.out.println("\nDeleting at position 0...");
        list.delete_at(0);
        System.out.print("List: ");
        list.print_list(); // Expected: 15 -> 20 -> null

        System.out.println("\n--- Edge Case Testing ---");
        System.out.println("Attempting to delete from an out-of-bounds position (e.g., 5)...");
        list.delete_at(5);
        System.out.print("List: ");
        list.print_list(); // Expected: 15 -> 20 -> null

        System.out.println("\nDeleting remaining elements...");
        list.delete_by_value(15);
        list.delete_by_value(20);
        System.out.print("List: ");
        list.print_list(); // Expected: null

        System.out.println("\n--- Rebuilding list for Search and Reverse ---");
        list.append(100);
        list.append(200);
        list.append(300);
        System.out.print("List: ");
        list.print_list(); // Expected: 100 -> 200 -> 300 -> null

        System.out.println("\n--- Testing Search ---");
        System.out.println("Searching for 200 (should be true): " + list.search(200));
        System.out.println("Searching for 999 (should be false): " + list.search(999));

        System.out.println("\n--- Testing Reverse ---");
        System.out.println("Reversing the list...");
        list.reverse();
        System.out.print("Reversed List: ");
        list.print_list(); // Expected: 300 -> 200 -> 100 -> null
    }
}