package Personal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    private ReverseLinkedList solution;

    @Before
    public void setUp(){
        solution = new ReverseLinkedList();
    }

    private Node getLinkedList(){
        Node node_1 = new Node();
        Node node_2 = new Node();
        Node node_3 = new Node();
        Node node_4 = new Node();
        Node node_5 = new Node();


        node_5.next = null;
        node_5.value = 5;

        node_4.value = 4;
        node_4.next = node_5;

        node_3.value = 3;
        node_3.next = node_4;

        node_2.value = 2;
        node_2.next = node_3;

        node_1.value = 1;
        node_1.next = node_2;

        return node_1;
    }

    @Test
    public void solution_Test1() throws Exception {
        Node inputLinkedList = getLinkedList();
        assertEquals(inputLinkedList.value, 1);

        solution.getReverseLinkedList(inputLinkedList);

    }

    @Test
    public void two_Node_Test() throws Exception {

    }

    @Test
    public void singleNode_Test() throws Exception {

    }
}