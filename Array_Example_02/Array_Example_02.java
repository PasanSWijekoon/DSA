

public class Array_Example_02 {
    public static void main(String[] args) {
       
        Array arr = new Array(3);
        arr.add(10);
        arr.add(20);

        System.out.println(arr); // Output: [10, 20]
        arr.add(1, 15);
        System.out.println(arr); // Output: [10, 15, 20]
        
    }

}