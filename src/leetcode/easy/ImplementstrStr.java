package leetcode.easy;

public class ImplementstrStr {

	public class Solution {
		
		/**
		 * Returns the index of the first occurrence of needle in haystack, 
		 * or -1 if needle is not part of haystack.
		 * @param haystack
		 * @param needle
		 * @return
		 */
	    public int strStr(String haystack, String needle) {
	        int hLen = haystack.length();
	        int nLen = needle.length();
	        
	        if(hLen==0 && nLen==0){
	        	return 0;
	        }else if(hLen==0 || nLen==0){
	        	return -1;
	        }
	        
	        boolean flag = haystack.contains(needle);
	        if(!flag) return -1;
	        
	        int res = haystack.indexOf(needle, 0);
	    	return res;
	    }
	}
	
	public static void main(String[] args){
		ImplementstrStr.Solution solu = new ImplementstrStr().new Solution();
		String haystack = "catsanddog";
		String needle = "sand";
		int res = solu.strStr(haystack, needle);
		System.out.println(res);
	}
}
