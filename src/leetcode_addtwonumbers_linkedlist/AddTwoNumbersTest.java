package leetcode_addtwonumbers_linkedlist;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void testAddTwoNumbers() {
		Solution solution = new Solution();
		ListNode l1 = new ListNode(2);
		//l1.next = new ListNode(4);
		//l1.next.next = new ListNode(3);
		ListNode p = l1;
		for (int i=2; i<10; i++){
			p.next = new ListNode(i);
			p = p.next;
		}
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		solution.addTwoNumbers(l1, l2);
	}

}
