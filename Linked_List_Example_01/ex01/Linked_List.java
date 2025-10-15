package ex01;

public class Linked_List {

    private Node head;

    // Node class as a private inner class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // --- Insertion Operations ---

    //Inserts a new node at the end of the list.
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Inserts a new node at the beginning of the list.
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Inserts a new node at a specific position.
     * @param position The position to insert the new node.
     * @param data The data for the new node.
     */
    public void insert_at(int position, int data) {
        if (position < 0) {
            System.out.println("Position cannot be negative.");
            return;
        }
        if (position == 0) {
            prepend(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // --- Deletion Operations ---

    /**
     * Deletes a node by its value.
     * @param data The data of the node to delete.
     */
    public void delete_by_value(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        }
    }

    /**
     * Deletes a node at a specific position.
     * @param position The position of the node to delete.
     */
    public void delete_at(int position) {
        if (head == null || position < 0) {
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int currentPosition = 0;

        while (current != null && currentPosition < position) {
            prev = current;
            current = current.next;
            currentPosition++;
        }

        if (current != null) {
            prev.next = current.next;
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    // --- Traversal Operation ---

    /**
     * Prints the elements of the list.
     */
    public void print_list() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // --- Search Operation ---

    /**
     * Searches for a node with the given data.
     * @param data The data to search for.
     * @return true if found, false otherwise.
     */
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // --- Reverse Operation ---

    /**
     * Reverses the linked list.
     */
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
}