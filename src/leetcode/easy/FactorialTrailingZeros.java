package leetcode.easy;

public class FactorialTrailingZeros {

	public class Solution {
		
		/**
		 * ��n!��ĩβ�м����㣺5!=120 9!=362880 10!=3628800 25!������
		 * ת��Ϊ��1��n�ж��ٸ�5
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
