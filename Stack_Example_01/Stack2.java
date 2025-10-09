public class Stack2 {

    private Node top;


    public Stack2() {
        this.top = null;
    }


    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top != null){
            Node temp = top;
            top = top.next;
            int value = temp.value;
            temp = null; // help GC
            return value;
        }else{
            return -1; // stack is empty
        }
    }
}