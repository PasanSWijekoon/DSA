package Stack_Example_01;

public class Stack { // no usages
    
    private int[] data; // 2 usages
    private int capacity, size, top; // 2 usages
    
    public Stack(int capacity) { // no usages
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }
    
    public boolean isFull(){ // 1 usage
        return top == capacity - 1;
    }

    public boolean isEmpty(){ 
        return top == -1;
    }
    
    public void push(int value){ // no usages
        if(!isFull()){
            data[++top] = value;
            size++;
        }else{
            System.out.println("Stack is full. Cannot push " + value);
        }
    }
    public int pop(){ // no usages
        if(!isEmpty()){
            size--;
            return data[top--];
        }else{
           throw new EmptyStackException();
        }
    }

    public int peek(){ // no usages
        if(!isEmpty()){
            return data[top];
        }else{
            throw new EmptyStackException();
        }
    }
    public int size(){ // no usages
        return size;
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