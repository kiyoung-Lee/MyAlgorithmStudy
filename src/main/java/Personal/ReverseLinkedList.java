package Personal;

class Node{
    public int value;
    public Node next;
}

public class ReverseLinkedList {

    public Node getReverseLinkedList(Node input){
        Node current = input;
        Node temp = input;
        Node flag = input;

        while(flag.next != null){
            flag = flag.next;
            temp = flag;
            temp.next = current;
            current = temp;
        }

        if(current == flag){
            return current;
        }

        return null;
    }
}
