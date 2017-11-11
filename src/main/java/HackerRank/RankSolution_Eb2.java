public class Ebay2 {

    public static class LinkedListNode{
        int val;
        LinkedListNode next;

        public LinkedListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static LinkedListNode removeNodes(LinkedListNode list, int x) {
        LinkedListNode currentNode = list;
        LinkedListNode nextNode;

        if(currentNode.val > x)
            return null;

        while (currentNode.next != null){
            nextNode = currentNode.next;

            if(currentNode.val > x){
                list = nextNode;
                currentNode = list;
            }

            if(nextNode.val > x){
                currentNode.next = null;
                while (nextNode.next != null){
                    nextNode = nextNode.next;
                    if(nextNode.val > x){
                        continue;
                    }else{
                        currentNode.next = nextNode;
                        break;
                    }
                }
            }else{
                currentNode = nextNode;
            }
        }

        return list;
    }
}
