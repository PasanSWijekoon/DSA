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

    //Search
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //Delete
    public void delete(int value) {
        int index = search(value);
        if (index == -1) {
          throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = 0; // Clear the last element
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