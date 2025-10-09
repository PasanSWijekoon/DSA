package Example02;

// This class demonstrates inserting an element at a specific index.
public class Array_Example_02 {
    public static void main(String[] args) {
       
        // 1. Create an array with a capacity of 3.
        Array arr = new Array(3);
        arr.add(10);
        arr.add(20);

        System.out.println(arr); // Should print [10, 20]
        
        // 2. Insert the value 15 at index 1.
        arr.add(1, 15);
        System.out.println(arr); // Should print [10, 15, 20]
        
    }

}
