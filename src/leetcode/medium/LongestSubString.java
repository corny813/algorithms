package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * TLE: Time limit exceed
 * @author corny
 *
 */
public class LongestSubString {

	public class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        
	    	int len = s.length();
	    	if(len < 2) return len;
	    	
	    	int max = 0;
	    	
	    	for(int i=0;i<len;i++){
	    		Set set = new HashSet();
	    		for(int j=i;j<len;j++){
	    			char tmp = s.charAt(j);
	    			if(set.contains(tmp)){
	    				int size = set.size();
	    				if(size > max){
	    					max = size;
	    					set.clear();
	    					System.out.println("max:"+max);
	    				}
	    			}else{
	    				set.add(tmp);
	    			}
	    		}
	    	}
	    	return max;
	    }
	}
	
	public static void main(String[] args){
		LongestSubString.Solution solu = new LongestSubString().new Solution();
		String s = "bbbbbb";
		solu.lengthOfLongestSubstring(s);
	}
}
