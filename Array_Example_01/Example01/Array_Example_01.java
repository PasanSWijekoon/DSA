package Example01;

// This class demonstrates the usage of the custom Array class.
public class Array_Example_01 {

    // The main method where the program starts.
    public static void main(String[] args) {
        
        // 1. Create an Array with a capacity of 2.
        Array arr = new Array(2);

        // 2. Add two elements to the array.
        arr.add(10);
        arr.add(20);

        // 3. Try to add a third element to the full array.
        try {
            arr.add(30);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the expected error and print its message.
            System.out.println(e.getMessage()); // Prints "Array is full"
        }

        // 4. Print the final state of the array.
        // The custom toString() method is called automatically.
        System.out.println(arr); // Prints "[10, 20]"
    }
}
