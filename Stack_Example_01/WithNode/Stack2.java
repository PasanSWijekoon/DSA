package WithNode;

/**
 * Implements a Stack data structure using a linked list of Nodes.
 * A stack follows the Last-In, First-Out (LIFO) principle.
 * This implementation is dynamic, meaning it can grow as needed and is not limited by a fixed size.
 */
public class Stack2 {

    // A reference to the node at the top of the stack.
    // This is the only entry point into the stack data structure.
    // If the stack is empty, 'top' will be null.
    private Node top;

    /**
     * Constructor for creating a new, empty stack.
     */
    public Stack2() {
        // An empty stack has no top node.
        this.top = null;
    }

    /**
     * Adds a new element to the top of the stack.
     * This is an O(1) operation - it takes the same amount of time regardless of the stack size.
     * @param value The integer value to push onto the stack.
     */
    public void push(int value) {
        // 1. Create a new node to hold the data.
        Node newNode = new Node(value);
        // 2. Set the new node's 'next' pointer to the current top of the stack.
        //    This links the new node to the rest of the stack.
        newNode.next = top;
        // 3. Update the 'top' reference to point to the new node, making it the new top.
        top = newNode;
    }

    /**
     * Removes and returns the element at the top of the stack.
     * This is an O(1) operation.
     * @return The value of the element that was removed, or -1 if the stack is empty.
     */
    public int pop(){
        // Check if the stack is not empty.
        if(top != null){
            // 1. Create a temporary reference to the current top node.
            Node temp = top;
            // 2. Move the 'top' reference down to the next node in the chain.
            top = top.next;
            // 3. Get the value from the node that was just removed.
            int value = temp.data;
            // 4. Set the temporary reference to null to help the garbage collector (GC) free up memory.
            temp = null;
            // 5. Return the retrieved value.
            return value;
        } else {
            // If the stack is empty, there is nothing to pop.
            return -1; // Indicate stack is empty
        }
    }

    /**
     * Returns the value of the top element without removing it.
     * @return The value of the element at the top, or -1 if the stack is empty.
     */
    public int peek(){
        // If the stack is empty, there is no element to see.
        if(top == null){
            System.out.println("Stack is Empty");
            return -1;
        } else {
            // Return the data from the top node.
            return top.data;
        }
    }

    /**
     * Provides a string representation of the stack for easy printing.
     * @return A string showing the stack contents from top to bottom.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: (top -> bottom) ");
        Node current = top;
        // Traverse the linked list from the top node to the last node.
        while (current != null) {
            sb.append(current.data);
            // Add an arrow if there is a next node.
            if(current.next != null) {
                sb.append(" -> ");
            }
            // Move to the next node in the chain.
            current = current.next;
        }
 
        return sb.toString();
    }

}
