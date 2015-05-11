package leetcode.easy;

public class ClimbingStairs {
	
	public class Solution {
		
		/**
		 * Each time you can either climb 1 or 2 steps
		 * @param n
		 * @return
		 */
	    public int climbStairs(int n) {
	        int[] sum = new int[n];
	        
	        if(n<=1) return n;
	        
	        sum[0] = 1;
	        sum[1] = 2;
	        
	        for(int i=2;i<n;i++){
	        	sum[i] = sum[i-1]+sum[i-2];
//	        	System.out.print(sum[i]+" ");
	        }
	    	return sum[n-1];
	    }
	    
	    public int climbStairs2(int n) {
	        
	        if(n<=1) return n;
	        
	        int a=1,b=2,res=0;
	        
	        for(int i=2;i<n;i++){
	        	res = a + b;
	        	a = b;
	        	b = res;
	        }
	    	return res;
	    }
	}
	
	public static void main(String[] args){
		ClimbingStairs.Solution solu = new ClimbingStairs().new Solution();
		int res = solu.climbStairs2(4);
		System.out.println(res);
	}

}
