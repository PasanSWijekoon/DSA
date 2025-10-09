package WithNode;

/**
 * This is a driver class to test the functionality of the linked-list-based Stack (Stack2).
 * It contains the main method which serves as the entry point of the program.
 */
public class Stack_Example_01_WithNode { // no usages
    
    /**
     * The main method to demonstrate the Stack2 class.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) { // no usages
        
        // Create a new instance of our linked-list-based stack.
        Stack2 stack = new Stack2();
        
        // Push three integer values onto the stack.
        // Since 30 is pushed last, it will be at the top.
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Print the current state of the stack.
        // Expected output: Stack: (top -> bottom) 30 -> 20 -> 10
        System.out.println(stack);
        
        // Remove the top element from the stack (which is 30) and print it.
        System.out.println("Popped: " + stack.pop());
        
        // Print the stack again to show the result of the pop operation.
        // Expected output: Stack: (top -> bottom) 20 -> 10
        System.out.println(stack);
        
        // Peek at the new top element (which is now 20) and print it.
        System.out.println("Top element: " + stack.peek());
    
    }
    
}
