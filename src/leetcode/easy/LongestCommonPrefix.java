package leetcode.easy;

public class LongestCommonPrefix {

	public class Solution {
		
		/**
		 * To find the longest common prefix string amongst an array of strings
		 * @param strs
		 * @return
		 */
	    public String longestCommonPrefix(String[] strs) {

	    	int len = strs.length;
	    	int minLen = Integer.MAX_VALUE;
	    	
	    	if(len < 1) return "";
	    	if(len==1) return strs[0];
	    	
	    	int[] lens = new int[len];
	    	
	    	for(int i=0;i<len;i++){
	    		lens[i] = strs[i].length();
	    		if(minLen > lens[i]){
	    			minLen = lens[i];
	    		}
	    	}
	    	System.out.println(minLen);
	    	
	    	if(minLen < 1) return "";
	    	
	    		for(int j=0;j<len-1;j++){
		    		boolean isEqual = strs[j].substring(0, minLen).equals(strs[j+1].substring(0, minLen));
		    		while(!isEqual && minLen > 0){
		    			minLen--;
		    			isEqual = strs[j].substring(0, minLen).equals(strs[j+1].substring(0, minLen));
		    		}
		    	}
//	    	System.out.println(minLen+" "+strs[0].substring(0,minLen));
	    	return strs[0].substring(0,minLen);
	    }
	}
	
	public static void main(String[] args){
		LongestCommonPrefix.Solution solu = new LongestCommonPrefix().new Solution();
//		String[] strs = {"ab","abcd","abcedf","add","add"};
		String[] strs = {};
		String res = solu.longestCommonPrefix(strs);
		System.out.println(res);
	}
}
