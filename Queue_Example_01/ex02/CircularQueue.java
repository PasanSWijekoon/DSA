package ex02;


public class CircularQueue {

    private int[] array;
    private int front,rear,size,capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            
            if (front == -1) {
                front = 0; 
            }

            rear = (rear + 1) % capacity; 
            array[rear] = value;
            size++;

            System.out.println("Enqueued: " + value);
            System.out.println("rear: " + rear);
            System.out.println("front: " + front);

           
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int value = array[front];
            System.out.println("Dequeued: " + value);
            front = (front + 1) % capacity; 
            System.out.println("rear: " + rear);
            System.out.println("front: " + front);
            size--;
            if (size == 0) {
                front = -1;
                rear = -1;
            }
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; 
        } else {
            return array[front];
        }
    }



    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[(front + i) % capacity]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }       


}  

