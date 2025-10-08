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

    //Add by index
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