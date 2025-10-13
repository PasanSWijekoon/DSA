package ex02;

public class Queue_Example_02 {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println(queue);

        queue.deQueue();

        System.out.println(queue);

        queue.enQueue(60);

        System.out.println(queue);

        queue.deQueue();

        System.out.println(queue);
        
        queue.deQueue();

        System.out.println(queue);
    }

}
