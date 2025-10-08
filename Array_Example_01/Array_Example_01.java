

public class Array_Example_01 {
    public static void main(String[] args) {
        Array arr = new Array(2);
        arr.add(10);
        arr.add(20);
        try {
            arr.add(30);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // Output: Array is full
        }
        System.out.println(arr); // Output: [10, 20]
    }
}