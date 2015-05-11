package leetcode.medium;

import java.util.ArrayList;

public class InsertSort {

	public static void main(String args[]) {

		InsertSort is = new InsertSort();
		
		ListNode head = new ListNode(2);
		ListNode n1 = new ListNode(-1);
		ListNode n2 = new ListNode(0);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		long start1 = System.currentTimeMillis();
		ListNode tmp =is.insertionSortList(head);
//		System.out.println(tmp.val);
//		while(tmp.next!=null){
//			tmp=tmp.next;
//			System.out.println(tmp.val);
//		}
		long end1 = System.currentTimeMillis();
		is.insertArray();
		long end2 = System.currentTimeMillis();
		System.out.println("time1:"+(end1-start1)+";time2:"+(end2-end1));
	}

	public void insertArray(){
		ArrayList arr = new ArrayList();
		arr.add(2);
		arr.add(-1);
		arr.add(0);
		arr.add(3);
		arr.add(4);
		
		for(int i=0;i<arr.size();i++){
			
			int pivot = (int) arr.get(i);
			
			for(int j=i+1;j<arr.size();j++){
				int val = (int) arr.get(j);
				if(val < pivot){
					int tmp = pivot;
					pivot = val;
					val = tmp;
					arr.set(i, pivot);
					arr.set(j, val);
				}
			}
		}
//		for(int k=0;k<arr.size();k++){
//			System.out.println(arr.get(k));
//		}
	}
	
	public static ListNode insertionSortList(ListNode head) {
		 
		if (head == null || head.next == null)
			return head;
 
		ListNode newHead = new ListNode(head.val);
		ListNode pointer = head.next;
 
		// loop through each element in the list
		while (pointer != null) {
			// insert this element to the new list
 
			ListNode innerPointer = newHead;
			ListNode next = pointer.next;
 
			if (pointer.val <= newHead.val) {
				ListNode oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
			} else {
				while (innerPointer.next != null) {
 
					if (pointer.val > innerPointer.val && pointer.val <= innerPointer.next.val) {
						ListNode oldNext = innerPointer.next;
						innerPointer.next = pointer;
						pointer.next = oldNext;
					}
 
					innerPointer = innerPointer.next;
				}
 
				if (innerPointer.next == null && pointer.val > innerPointer.val) {
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}
 
			// finally
			pointer = next;
		}
 
		return newHead;
	}
	
	public ListNode insertionSortList2(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode c = head.next;
        head.next = null;
        ListNode pt, h;

        while (c != null) {

        	System.out.println("c:"+c.val);
            pt = c;
            c = c.next;
//            System.out.println("c:"+c.val);
            pt.next = null;

            if (head.val > pt.val) {
            	System.out.println("head:"+head.val+";pt:"+pt.val);
                pt.next = head;
                head = pt;
                System.out.println("head:"+head.val+";pt:"+pt.val);
                continue;
            }
            
            System.out.println("head:"+head.val+";pt:"+pt.val);
            h = head;
            while (h.next != null) {
                if (h.next.val > pt.val) {
                    pt.next = h.next;
                    h.next = pt;
                    System.out.println("h:"+h.val+"h.next:"+h.next.val+";pt:"+pt.val);
                    break;
                }

                h = h.next;
            }
            System.out.println("h:"+h.val+";pt:"+pt.val);

            if (h.next == null) {
                h.next = pt;
            }
        }

        return head;
    }
}
