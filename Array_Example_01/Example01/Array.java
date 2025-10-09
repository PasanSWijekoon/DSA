package Example01;

// A custom array with a fixed capacity.
public class Array {
    
    private int[] data;  // The underlying array to store elements.
    private int size;    // The current number of elements in the array.
    private int capacity; // The maximum number of elements the array can hold.

    // Constructs an Array with a specific capacity.
    public Array(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity]; // Initialize the internal array.
        this.size = 0; // A new array is empty.
    }

    // Adds a value to the end of the array.
    public void add(int value) {
        // If the array is not full, add the element and increment the size.
        if (size < capacity) {
            data[size++] = value;
        } else {
            // If the array is full, throw an error.
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
    }

    // Returns a string representation of the array, e.g., "[10, 20]".
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i < size - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}