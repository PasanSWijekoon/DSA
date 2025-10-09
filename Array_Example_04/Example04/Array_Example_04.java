package Example04;

// This class demonstrates deleting an element from the array.
public class Array_Example_04 {
    public static void main(String[] args) {
       
        // 1. Create and fill an array.
        Array arr = new Array(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr); // Initial state: [10, 20, 30, 40, 50]
        
        // 2. Delete an existing element (30).
        arr.delete(30);
        System.out.println(arr); // Result: [10, 20, 40, 50]

        // 3. Try to delete a non-existing element (100).
        arr.delete(100); // This will do nothing.
        System.out.println(arr); // Result: [10, 20, 40, 50]
    }
}
