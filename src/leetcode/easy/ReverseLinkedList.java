package leetcode.easy;

public class ReverseLinkedList {

	public static void main(String args[]){
		ReverseLinkedList rl = new ReverseLinkedList();
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
//		ListNode n2 = new ListNode(3);
//		ListNode n3 = new ListNode(4);
//		ListNode n4 = new ListNode(5);
		head.next = n1;
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;

		head = rl.reverseBetween(head, 1, 2);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode mNode = head;
        ListNode nNode = head;
        int mm = m;
        int nn = n;
        
        while(mm>1){
            mNode = mNode.next;
            mm--;
        }
        System.out.println("mNode:"+mNode.val);
        nNode = mNode;
        mm = m;
        while((nn-mm)>0){
        	System.out.println("while...");
            nNode = nNode.next;
            nn--;
        }
       System.out.println("nNode:"+nNode.val);
       
       if(m==1 && n==1) return head;
       int tmp = mNode.val;
       mNode.val = nNode.val;
       nNode.val = tmp;
       
        return head;        
    }
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int a){
		val = a;
		next = null;
	}
}