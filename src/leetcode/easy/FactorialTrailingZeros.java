package leetcode.easy;

public class FactorialTrailingZeros {

	public class Solution {
		
		/**
		 * 求n!的末尾有几个零：5!=120 9!=362880 10!=3628800 25!六个零
		 * 转化为从1到n有多少个5
		 * @param n
		 * @return
		 */
		
	    public int trailingZeroes(int n) {
	    	int res=0;
	    	while(n>0){
	    		res += n/5;
	    		n=n/5;
	    	}
	    	return res;
	    }
	}
	
	public static void main(String[] args){
		FactorialTrailingZeros.Solution solu = new FactorialTrailingZeros().new Solution();
		int res = solu.trailingZeroes(25);
		System.out.println(res);
	}
}
