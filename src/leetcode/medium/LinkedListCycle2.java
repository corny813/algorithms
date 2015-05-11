package leetcode.medium;

public class LinkedListCycle2 {

	public static void main(String args[]) {

		LinkedListCycle2 cycle = new LinkedListCycle2();
		ListNode head = new ListNode(-21);
		ListNode n1 = new ListNode(10);
//		ListNode n2 = new ListNode(17);
//		ListNode n3 = new ListNode(8);
//		ListNode n4 = new ListNode(4);
//		ListNode n5 = new ListNode(26);
		
		head.next = n1;
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n3;
		
		ListNode begin =cycle.detectCycle(head);
		if(begin!=null)
		System.out.println(begin.val);
	}

public ListNode detectCycle(ListNode head) {
		
		ListNode fast=head;
		ListNode slow=head;
		
		if(head==null || head.next==null) return null;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) break;
		}
		fast = head;
		while(fast!=slow && slow.next!=null){
			fast = fast.next;
			slow = slow.next;
		}
		if(slow==fast)	return slow;
		else return null;
	}
}
