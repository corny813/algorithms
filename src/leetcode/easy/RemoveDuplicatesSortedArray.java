package leetcode.easy;

public class RemoveDuplicatesSortedArray {

	public class Solution {
		
		/**
		 * Given a sorted array, remove the duplicates in place 
		 * such that each element appear only once and return the new length
		 * example:
		 * 	A = [1,1,2]
		 * should return length = 2, and A is now [1,2]
		 * @param A
		 * @return
		 */
	    public int removeDuplicates(int[] A) {
	        int res = 0;
	        int len = A.length;
	        
	        if(len < 2) return len;
	        
	        for(int i=0;i<len-1;i++){
	        	if(A[i+1]==A[i]){
	        		continue;
	        	}else{
	        		res++;
	        		A[res]=A[i+1];
	        	}
	        }
	        
	        for(int num:A){
	        	System.out.print(num+" ");
	        }
	        System.out.println();
	        return res+1;
	    }
	}
	
	public static void main(String[] args){
		RemoveDuplicatesSortedArray.Solution solu = new RemoveDuplicatesSortedArray().new Solution();
		int[] A = {1,1,1,2,2};
		int res = solu.removeDuplicates(A);
		System.out.println(res);
	}
}
