package leetcode.easy;

public class ReverseInteger {

	public class Solution {
		
		/**
		 * Reverse digits of an integer.
		 * Example1: x = 123, return 321 ; Example2: x = -123, return -321
		 * @param x
		 * @return
		 */
	    public int reverse(int x) {
	        long res = 0;
	        
	    	while(x!=0){
	    		res = res*10 + x%10;
	    		x = x/10;
	    	}
	    	System.out.println(res);
	    	if(res>Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
	    	return (int) res;
	    }
	}
	
	public static void main(String[] args){
		ReverseInteger.Solution solu = new ReverseInteger().new Solution();
//		int x = 1534236469;
//		int x = -2147483648;
		int x = 100;
		
		solu.reverse(x);
	}
}
