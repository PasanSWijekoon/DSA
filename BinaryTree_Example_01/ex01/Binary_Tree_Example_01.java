package ex01;

public class Binary_Tree_Example_01 {


    public static void main(String[] args) {
       
        Binary_Tree tree = new Binary_Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Perform in-order traversal
        System.out.println("In-order traversal:");
        tree.inOrder(tree.root);
    }

}
   