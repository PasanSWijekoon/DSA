package WithoutNode;

/**
 * This is a driver class to test the functionality of the array-based Stack.
 * It contains the main method which serves as the entry point of the program.
 */
public class Stack_Example_01_WithoutNode { // no usages
    
    /**
     * The main method to demonstrate the array-based Stack class.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) { // no usages
        
        // Create a new instance of our array-based stack with a maximum capacity of 5.
        Stack stack = new Stack(5);
        
        // Push three integer values onto the stack.
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Check if the stack is full. Expected: false, because capacity is 5 and size is 3.
        System.out.println("Is stack full? " + stack.isFull());
        
        // Check the current size of the stack. Expected: 3.
        System.out.println("Stack size: " + stack.size());
        
        // Peek at the top element. Since 30 was pushed last, it's on top. Expected: 30.
        System.out.println("Top element: " + stack.peek());
        
        // Print the contents of the stack. Expected: [10, 20, 30]
        System.out.println("Stack contents: " + stack.toString());
        
        // Pop the top element (30) and print it.
        System.out.println("Popped element: " + stack.pop());
        
        // Print the contents after the pop. Expected: [10, 20]
        System.out.println("Stack contents after pop: " + stack.toString());
        
        // Check the size after popping. Expected: 2.
        System.out.println("Stack size after pop: " + stack.size());
        
        // Check if the stack is full again. Expected: false.
        System.out.println("Is stack full? " + stack.isFull());
        
    }
    
}
