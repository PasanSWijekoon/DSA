public class Array_Example_04 {
    public static void main(String[] args) {
       
        Array arr = new Array(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr); // Output: [10, 20, 30, 40, 50]
        
        arr.delete(30);
        System.out.println(arr); // Output: [10, 20, 40, 50]

        arr.delete(100); // No change
        System.out.println(arr); // Output: [10, 20, 40, 50]
    }
}