package leetcode.easy;

public class ReverseBits {

	public class Solution {
	    // you need treat n as an unsigned value
	    public int reverseBits(int n) {
	        int res = 0;
	        
//	        System.out.println(n&1);
	        
	        for(int i=0;i<32;i++){
	        	res = ((res<<1) + (n&1));
	        	n=n>>1;
//	        	System.out.print(res+" ");
	        }
	        return res;
	    }
	}
	
	public static void main(String[] args){
		ReverseBits.Solution solu = new ReverseBits().new Solution();
		int res = solu.reverseBits(1);
//		System.out.println("res="+res);
		int tmp = 3 | 5;
		System.out.println(tmp);
	}
}
