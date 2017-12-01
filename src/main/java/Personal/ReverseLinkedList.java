package Personal;

class Node{
    public int value;
    public Node next;
}

public class ReverseLinkedList {

    public Node getReverseLinkedList(Node input){

        // Set Header
        Node header = new Node();
        header.next = input;

        Node flagNode = new Node();
        flagNode.value = input.next.value;
        flagNode.next = input.next.next;

        Node currentNode = input;

        while(flagNode.next != null){
            flagNode = flagNode.next;

            currentNode = currentNode.next;
            currentNode.next = header.next;


            currentNode = flagNode;

        }






        return null;
    }
}
