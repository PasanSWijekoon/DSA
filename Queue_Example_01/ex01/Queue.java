package ex01;

public class Queue {

    private int[] arr;      // Array to store queue elements.
    private int size;       // Current number of elements in the queue.
    private int front;      // Index of the front element.
    private int rear;       // Index of the last element.
    private int capacity;   // Maximum capacity of the queue.

   
    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1; // -1 indicates the queue is initially empty.
        size = 0;
    }

    // Checks if the queue is full.
    public boolean isFull() {
        return size == capacity;
    }

    // Checks if the queue is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // Adds an element to the rear of the queue (Enqueue operation).
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            rear++;
            arr[rear] = value;
            size++;
        }
    }


    // Removes and returns the element from the front of the queue (Dequeue operation).
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return -1 for error/empty.
        } else {
            int value = arr[front];
            front++; // Move front pointer forward.
            size--;
            // NOTE: This implementation has a potential issue where the front pointer keeps moving,
            // eventually exceeding the array bounds if not handled as a Circular Queue.
            // For this basic, non-circular implementation, it works until 'front' reaches 'capacity'.
            return value;
        }
    }

    // Returns the front element without removing it (Peek operation).
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return -1 for error/empty.
        } else {
            return arr[front];
        }
    }

    // Overrides the toString method to display queue elements.
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is empty.";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Queue elements: ");
            // Loop from the current front index up to the current rear index.
            for (int i = front; i <= rear; i++) {
                sb.append(arr[i]).append(" ");
            }
            return sb.toString();
        }
    }
}