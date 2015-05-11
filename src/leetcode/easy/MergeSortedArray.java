package leetcode.easy;

public class MergeSortedArray {

	public class Solution {
		
		/**
		 * Given two sorted integer arrays A and B, 
		 * merge B into A as one sorted array.
		 * A has enough space (size that is greater or equal to m + n)
		 * @param A
		 * @param m
		 * @param B
		 * @param n
		 */
	    public void merge(int A[], int m, int B[], int n) {
	        
	    	if(A[m-1] < B[0]){
	    		for(int i=0;i<n;i++){
	    			A[m+i]=B[i];
	    		}
	    	}
	    	if(A[0] > B[n-1]){
	    		for(int i=m-1;i>=0;i--){
	    			A[i+n]=A[i];
	    		}
	    		for(int i=0;i<n;i++){
	    			A[i]=B[i];
	    		}
	    	}
	    
	    	while(n>0){
	    		A[m+n-1] = (m==0 || B[n-1]>A[m-1])?B[--n]:A[--m];
	    	}
	    	
	    	for(int num:A){
	    		System.out.print(num+" ");
	    	}
	    }
	}
	
	public static void main(String[] args){
		MergeSortedArray.Solution solu = new MergeSortedArray().new Solution();
		int m = 5;
		int n = 2;
		int[] A =new int[m+n];
		for(int i=0;i<m;i++){
			A[i] = i+2;
		}
		int[] B ={4,5};
		
		solu.merge(A, m, B, n);
	}
}
