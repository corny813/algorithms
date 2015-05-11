package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	
	public static void main(String args[]){
		
		SortList sl = new SortList();
		ListNode head = new ListNode(2);
		ListNode n1 = new ListNode(-1);
		ListNode n2 = new ListNode(0);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode n0 = sl.sortList(head);
		while(n0.next != null){
			System.out.print(n0.val+"\t");
			n0 = n0.next;
		}
		System.out.print(n0.val+"\t");
	
	}
	
	public ListNode sortList(ListNode head){
		
		if(head==null || head.next==null) return head;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		ListNode tmp = head;
		list.add(head.val);
		while(tmp.next != null){
			tmp = tmp.next;
			list.add(tmp.val);
		}
		Collections.sort(list);
	
		tmp = head;
		for(Integer i:list){
			 tmp.val = i;
			 tmp = tmp.next;
//			 System.out.print(i+"\t");
		}
		
		return head;
	}
}
