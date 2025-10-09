package Example03;


// This class demonstrates searching for an element in the array.
public class Array_Example_03 {
    public static void main(String[] args) {
       
        // 1. Create and fill an array.
        Array arr = new Array(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);

        // 2. Search for an existing element (30).
        System.out.println("Index of 30 is: " + arr.search(30)); // Should be 2

        // 3. Search for a non-existing element (100).
        System.out.println("Index of 100 is: " + arr.search(100)); // Should be -1
        
    }
}
