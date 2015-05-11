package leetcode.easy;

public class MergeTwoSortedLists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		
		/**
		 * 假设为从小到大排序
		 * @param l1
		 * @param l2
		 * @return
		 */
		public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			ListNode pHead;
			
			if(l1 == null){
				return l2;
			}else if(l2 == null){
				return l1;
			}
			
			if(l1.val < l2.val){
				pHead = l1;
				l1 = l1.next;
			}else{
				pHead = l2;
				l2 = l2.next;
			}
			ListNode head = pHead;
			
			while(l1!=null && l2!=null){
				
//				System.out.println(l1.val+","+l2.val);
				
				if(l1.val < l2.val){
					pHead.next = l1;
					l1 = l1.next;
				}else{
					pHead.next = l2;
					l2 = l2.next;
				}
				pHead = pHead.next;
			}
			
//			while(l1 != null){
//				pHead.next = l1;
//				pHead = pHead.next;
//				l1 = l1.next;
//			}
//			while(l2 != null){
//				pHead.next = l2;
//				pHead = pHead.next;
//				l2 = l2.next;
//			}
			
			pHead.next = l1==null?l2:l1;
			
			return head;
		}
	}
	
	public static void main(String[] args){
		MergeTwoSortedLists merge = new MergeTwoSortedLists();
		MergeTwoSortedLists.Solution solu = merge.new Solution();
		
		ListNode l1 = merge.new ListNode(1);
		ListNode l2 = merge.new ListNode(2);
		
		ListNode node3 = merge.new ListNode(3);
		ListNode node4 = merge.new ListNode(4);
		ListNode node5 = merge.new ListNode(5);
		
		l1.next = node3;
		node3.next = node5;
		
		l2.next = node4;
		MergeTwoSortedLists.ListNode head = solu.mergeTwoLists(l1, l2);
		
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
