public class Array_Example_03 {
    public static void main(String[] args) {
       
        Array arr = new Array(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);
        System.out.println("Index of 30 is: " + arr.search(30));
        System.out.println("Index of 100 is: " + arr.search(100));
        
    }
}