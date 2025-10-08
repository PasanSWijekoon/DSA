public class Array {
    
    private int[] data;
    private int size;
    private int capacity;

    public Array(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];  
    }

    //Add
    public void add(int value) {
        if (size < capacity) {
            data[size++] = value; // postfix increment
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
    }

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