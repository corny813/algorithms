package leetcode.easy;

public class IntersecTwoLinkedLists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			int aLen=1;
			int bLen=1;
			
			ListNode aPointer = headA;
			ListNode bPointer = headB;
			
			if(headA==null || headB==null) return null;
			
			while(aPointer.next!=null){
				aLen++;
				aPointer=aPointer.next;
			}
			System.out.println(aLen);
			
			while(bPointer.next!=null){
				bLen++;
				bPointer=bPointer.next;
			}
			System.out.println(bLen);
			
			ListNode pointer = aLen>bLen?headA:headB;
			int cLen = aLen<bLen?aLen:bLen;
			aPointer = headA;
			bPointer = headB;
			
			for(int i=0;i<Math.abs(aLen-bLen);i++){
				pointer=pointer.next;
			}
			System.out.println(pointer.val);
			
			for(int i=0;i<cLen;i++){
				if(aLen > bLen){
					//pointer在A上
					if(pointer.val==bPointer.val){
						System.out.println(pointer.val);
						return pointer;
					}
					pointer = pointer.next;
					bPointer = bPointer.next;
				}else{
					//pointer在B上
					if(pointer.val==aPointer.val){
						System.out.println(pointer.val);
						return pointer;
					}
					pointer = pointer.next;
					aPointer = aPointer.next;
				}
			}
			return null;
		}
	}
	
	public static void main(String[] args){
		
		IntersecTwoLinkedLists intersec=new IntersecTwoLinkedLists();
		
		IntersecTwoLinkedLists.Solution solu = intersec.new Solution();
		
		IntersecTwoLinkedLists.ListNode headA = intersec.new ListNode(1);
		headA.next = intersec.new ListNode(2);
		
		IntersecTwoLinkedLists.ListNode headB = intersec.new ListNode(2);
		
		solu.getIntersectionNode(headA, headB);
	}
}
