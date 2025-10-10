package ex01;

public class Queue_Example_01 {

    public static void main(String[] args) {

        // 1. Create a new Queue with a capacity of 5.
        Queue myQueue = new Queue(5);

        // Check the initial state.
        System.out.println("Is queue empty? " + myQueue.isEmpty());

        // 2. Add 5 elements to the queue (EnQueue operations).
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);
        myQueue.enQueue(50);

        // Display the queue and check if it's full.
        System.out.println(myQueue);
        System.out.println("Is queue full? " + myQueue.isFull());

        // 3. Remove the first two elements (DeQueue operations). (10 and 20 are removed)
        myQueue.deQueue();
        System.out.println(myQueue);
        myQueue.deQueue();
        System.out.println(myQueue);

        // 4. Look at the front element without removing it (Peek operation).
        System.out.println("Peeked value: " + myQueue.peek());

        // 5. Remove the next two elements. (30 and 40 are removed)
        myQueue.deQueue();
        myQueue.deQueue();

        // Check capacity status.
        System.out.println("Is queue full? " + myQueue.isFull());
        System.out.println(myQueue); // Should only contain 50 now.

        // 6. Remove the last element and check for emptiness. (50 is removed)
        myQueue.deQueue();
        System.out.println("Is queue empty? " + myQueue.isEmpty());

    }
}