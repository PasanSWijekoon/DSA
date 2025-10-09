package WithNode;

/**
 * Represents a single node in a linked list.
 * Each node contains a piece of data and a reference (link) to the next node in the chain.
 * This is the fundamental building block for the linked-list-based stack.
 */
public class Node {
    // The integer value stored in this node.
    public int data;

    // A reference to the next node in the list.
    // If this is the last node, 'next' will be null.
    public Node next;

    /**
     * Constructor to create a new Node.
     * @param data The integer value to be stored in the node.
     */
    public Node(int data) {
        this.data = data;
        // By default, a new node does not point to any other node.
        this.next = null;
    }
}
