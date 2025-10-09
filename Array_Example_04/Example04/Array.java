package Example04;

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
        if (index >= 0 && index <= size && size < capacity) {
            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = value;
            size++;
        }else {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds or Array is full");
        }
    }

    // Searches for a value and returns its index.
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Deletes the first occurrence of a given value.
    public void delete(int value) {
        // Find the index of the element to delete.
        int index = search(value);

        // If the value was not found, do nothing.
        if (index == -1) {
          return; // Exit the method
        }

        // Shift elements to the left to cover the deleted element.
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        
        // Decrement the size and clear the last element.
        data[--size] = 0; 
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
