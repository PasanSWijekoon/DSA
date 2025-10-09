package Example02;

// A custom array with a fixed capacity.
public class Array {
    
    private int[] data;  // The underlying array to store elements.
    private int size;    // The current number of elements in the array.
    private int capacity; // The maximum number of elements the array can hold.

    // Constructs an Array with a specific capacity.
    public Array(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    // Adds a value to the end of the array.
    public void add(int value) {
        if (size < capacity) {
            data[size++] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
    }

    // Inserts a value at a specific index.
    public void add(int index, int value) {
        // Check if the index is valid and the array is not full.
        if (index >= 0 && index <= size && size < capacity) {
            // Shift elements to the right to make space.
            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = value; // Insert the new value.
            size++; // Increment the size.
        }else {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds or Array is full");
        }
    }

    // Returns a string representation of the array.
    @Override
    public String toString() {
        String out = "[";
        for (int i = 0; i < size; i++) {
            out += data[i];
            if (i == size - 1) {
                out += "]";
            } else {
                out += ", ";
            }
        }
        return out;
    }

}
