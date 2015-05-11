package leetcode.easy;

public class RemoveNthNodeFromEnd {

	  public class ListNode {
	      int val;
	     ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 	
	public class Solution {
		
	    public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode fast = head;
			ListNode slow = head;
			ListNode preSlow = new ListNode(-1);
			preSlow.next = slow;
			
			if(n<2 && head.next==null){
//				System.out.println("head next is null");
				return null;
			}
			
			int tmp = n;
			while(tmp>1){
				fast = fast.next;
				tmp--;
			}
			while(fast.next!= null){
				fast = fast.next;
				slow = slow.next;
				preSlow = preSlow.next;
			}
			if(slow == head){
				head = slow.next;
				System.out.println("head value:"+head.val);
				return head;
			}
			if(slow != fast){
				preSlow.next = slow.next;
			}else{
				preSlow.next = null;
			}
			
//			System.out.println(slow.val);
			
	    	return head;
	    }
	}
	
	public static void main(String[] args){
		RemoveNthNodeFromEnd remove = new RemoveNthNodeFromEnd();
		RemoveNthNodeFromEnd.Solution solu = remove.new Solution();
		RemoveNthNodeFromEnd.ListNode head = remove.new ListNode(1);
		int n = 2;
//		int n = 1;
		
		ListNode node2 = remove.new ListNode(2);
		ListNode node3 = remove.new ListNode(3);
		ListNode node4 = remove.new ListNode(4);
		ListNode node5 = remove.new ListNode(5);
		
		head.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
		
		ListNode tmp = solu.removeNthFromEnd(head, n);
		
		while(tmp!=null){
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}

