package leetcode.easy;

public class ValidPalindrome {

	public class Solution {
		
		/**
		 * Given a string, determine if it is a palindrome, 
		 * considering only alphanumeric characters and ignoring cases
		 * we define empty string as valid palindrome.
		 * example:
		 * 	"A man, a plan, a canal: Panama" is a palindrome
		 *  "race a car" is not a palindrome
		 * @param s
		 * @return
		 */
	    public boolean isPalindrome(String s) {
	    	int len = s.length();
	    	if(len < 2) return true;
	    	String tmp = s.replaceAll("[^a-zA-Z0-9]", "");
//	    	System.out.println(tmp);
	    	len = tmp.length();
	    	if(len < 2) return true;
	    	
	    	int half = len/2;
	    	StringBuilder left = new StringBuilder();
	    	StringBuilder right = new StringBuilder();
	    	
	    	left.append(tmp.substring(0,half));
	    	if(len%2!=0){
	    		right.append(tmp.substring(half+1,len));
	    	}else{
	    		right.append(tmp.substring(half,len));
	    	}
	    	System.out.println(left+","+right);
	    	String leftStr = left.toString().toLowerCase();
	    	String rightStr = right.reverse().toString().toLowerCase();
	    	System.out.println(leftStr+","+rightStr);
	    	if(leftStr.equals(rightStr)){
	    		return true;
	    	}else{
	    		return false;
	    	}
	    }
	    public boolean isPalindrome2(String s) {
	    	int len = s.length();
	    	if(len < 2) return true;
	    	String tmp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	    	int tmpLen = tmp.length();
	    	if(tmpLen < 2) return true;
	    	
	    	int half = tmpLen/2;
	    	boolean flag = true;
	    	
	    	for(int i=0;i<half;i++){
	    		System.out.println(tmp.charAt(i)+" "+tmp.charAt(tmpLen-1-i));
	    		if(tmp.charAt(i)!=tmp.charAt(tmpLen-1-i)){
	    			flag = false;
	    		}
	    	}
	    	return flag;
	    }
	    
	    public boolean isPalindrome3(String s){
	    	String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");
	        return ss.equals(new StringBuilder(ss).reverse().toString());
	    }
	}
	
	public static void main(String[] args){
		ValidPalindrome.Solution solu = new ValidPalindrome().new Solution();
		String s ="A man, a plan, a canal: Panama";
		boolean res = solu.isPalindrome2(s);
		System.out.println(res);
	}
}
