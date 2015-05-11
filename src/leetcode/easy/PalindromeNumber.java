package leetcode.easy;

public class PalindromeNumber {

	public class Solution {
		
		/**
		 * Determine whether an integer is a palindrome. Do this without extra space
		 * @param x
		 * @return
		 */
	    public boolean isPalindrome(int x) {
	        int reverse = 0;
	        int tmp = x;
	    	if(x<0) return false;
	        while(x!=0){
	        	reverse = reverse*10 + x%10;
	        	x /= 10;
	        }
//	        System.out.println(reverse+","+tmp+":"+(reverse==tmp));
	    	return reverse==tmp;
	    }
	}
	
	public static void main(String[] args){
		PalindromeNumber.Solution solu = new PalindromeNumber().new Solution();
		int x = 22;
		boolean res = solu.isPalindrome(x);
		System.out.println(res);
	}
}
