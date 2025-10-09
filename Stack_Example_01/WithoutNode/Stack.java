package WithoutNode;
import java.util.EmptyStackException;

/**
 * Implements a Stack data structure using a fixed-size array.
 * A stack follows the Last-In, First-Out (LIFO) principle.
 * This implementation is "static" because its maximum size (capacity) is defined at creation.
 */
public class Stack { // no usages
    
    // The array that will store the stack's elements.
    private int[] data;
    
    // capacity: The maximum number of elements the stack can hold.
    // size: The current number of elements in the stack.
    // top: The array index of the top-most element of the stack.
    private int capacity, size, top;
    
    /**
     * Constructor to create a new stack with a specified capacity.
     * @param capacity The maximum number of elements this stack can hold.
     */
    public Stack(int capacity) { // no usages
        this.capacity = capacity;
        // Create the integer array with the given capacity.
        this.data = new int[capacity];
        // An empty stack has no elements, so top is set to -1 (an invalid index).
        this.top = -1;
    }
    
    /**
     * Checks if the stack has reached its maximum capacity.
     * @return true if the stack is full, false otherwise.
     */
    public boolean isFull(){ // 1 usage
        return top == capacity - 1;
    }

    /**
     * Checks if the stack has no elements.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty(){ 
        return top == -1;
    }
    
    /**
     * Adds a new element to the top of the stack if it's not full.
     * @param value The integer value to push onto the stack.
     */
    public void push(int value){ // no usages
        // Only push if the stack is not already full.
        if(!isFull()){
            // Increment top first, then place the value at the new top index.
            data[++top] = value;
            // Increase the count of elements.
            size++;
        } else {
            // Inform the user if the push operation fails.
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    /**
     * Removes and returns the element at the top of the stack.
     * @return The value of the element that was removed.
     * @throws EmptyStackException if the stack is empty.
     */
    public int pop(){ // no usages
        // Only pop if the stack is not empty.
        if(!isEmpty()){
            // Decrease the count of elements.
            size--;
            // Return the value at the current top index, and then decrement top.
            return data[top--];
        } else {
           // It is common practice to throw an exception if pop is called on an empty stack.
           throw new EmptyStackException();
        }
    }

    /**
     * Returns the value of the top element without removing it.
     * @return The value of the element at the top.
     * @throws EmptyStackException if the stack is empty.
     */
    public int peek(){ // no usages
        if(!isEmpty()){
            // Return the data from the top index.
            return data[top];
        } else {
            throw new EmptyStackException();
        }
    }

    /**
     * Returns the current number of elements in the stack.
     * @return The size of the stack.
     */
    public int size(){ // no usages
        return size;
    }

    /**
     * Provides a string representation of the stack for easy printing.
     * @return A string showing the stack contents in array format.
     */
    @Override
    public String toString() {
        String out = "[";
        // Loop through the elements currently in the stack.
        for (int i = 0; i < size; i++) {
            out += data[i];
            // Add a closing bracket for the last element.
            if (i == size - 1) {
                out += "]";
            } else {
                // Add a comma and space for all other elements.
                out += ", ";
            }
        }
        // If the stack is empty, this will just return "[". Let's fix that for clarity.
        if (isEmpty()) {
            return "[]";
        }
        return out;
    }
    
}
