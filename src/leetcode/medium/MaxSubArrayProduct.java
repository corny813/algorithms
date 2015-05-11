package leetcode.medium;

public class MaxSubArrayProduct {

	public class Solution {
		
	    public int maxProduct(int A[]) {
	        if(A==null||A.length==0) {
		      return 0;
		    }
		    if(A.length==1){
		        return A[0];
		    }
		    int maxProduct = A[0];
		    int max_temp   = A[0];
		    int min_temp   = A[0];
		    int a,b;
		    
		    for(int i=1;i<A.length;i++) {
		    	a = A[i]*max_temp;
		    	b = A[i]*min_temp;
		    	max_temp = Math.max(Math.max(a,b), A[i]);
		    	min_temp = Math.min(Math.min(a,b), A[i]);
		    	maxProduct = Math.max(maxProduct, max_temp);
		    }
		    return maxProduct;
	    }
	}
	
	public static void main(String[] args){
		MaxSubArrayProduct.Solution solu = new MaxSubArrayProduct().new Solution();
		
	}
}
