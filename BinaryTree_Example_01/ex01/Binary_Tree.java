
package ex01;

public class Binary_Tree {
    
    Node root;

    public void inOrder(Node node) {
        if (node != null) {

            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
}
