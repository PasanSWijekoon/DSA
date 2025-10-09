import Stack_Example_01.Stack;


public class Stack_Example_01 { // no usages
    
    public static void main(String[] args) { // no usages
        
        Stack stack = new Stack(5); // 1 usage
        stack.push(10); // 1 usage
        stack.push(20); // 1 usage
        stack.push(30); // 1 usage


        System.out.println("Is stack full? " + stack.isFull()); // 1 usage
        System.out.println("Stack size: " + stack.size()); // 1 usage
        System.out.println("Top element: " + stack.peek()); // 1 usage
        System.out.println("Stack contents: " + stack); // 1 usage
        System.out.println("Popped element: " + stack.pop()); // 1 usage
        System.out.println("Stack contents after pop: " + stack); // 1 usage
        System.out.println("Stack size after pop: " + stack.size()); // 1 usage
        System.out.println("Is stack full? " + stack.isFull()); // 1 usage
        
    }
    
}