
/*
 Author:     King, wangjingui@outlook.com
 Date:       Dec 13, 2014
 Problem:    Add Two Numbers
 Difficulty: easy
 Source:     https://oj.leetcode.com/problems/add-two-numbers/
 Notes:
 You are given two linked lists representing two non-negative numbers. 
 The digits are stored in reverse order and each of their nodes contain a single digit. 
 Add the two numbers and return it as a linked list.
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Solution: dummy head...
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class AddTwoNumbers {
	
	public ListNode Solution(ListNode l1, ListNode l2){
		ListNode sumNode = new ListNode(0);
		ListNode headNode = sumNode;
		
		while(l1.next != null && l2.next != null)
		{
			int value1 = l1.val;
			int value2 = l2.val;
			int sum = value1 + value2;
			
			ListNode addNode = new ListNode(sum);
			sumNode.next = addNode;
			
			sumNode = sumNode.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		return headNode.next;
	}	
}
