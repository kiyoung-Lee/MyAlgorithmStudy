
public class AlgoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		AddTwoNumbers sol1 = new AddTwoNumbers();
		
		ListNode l1 = new ListNode(2);
		ListNode l1_addNode = new ListNode(4);
		ListNode l1_lastNode = new ListNode(3);
		
		l1_addNode.next = l1_lastNode;		
		l1.next = l1_addNode; 
		
		ListNode l2 = new ListNode(5);
		ListNode l2_addNode = new ListNode(6);
		ListNode l2_lastNode = new ListNode(4);
		
		l2_addNode.next = l2_lastNode;
		l2.next = l2_addNode;				
		
		ListNode result = sol1.Solution(l1, l2);
		while(result.next != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

}