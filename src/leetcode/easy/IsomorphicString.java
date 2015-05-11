package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public class Solution {
	    public boolean isIsomorphic(String s, String t) {
	        
	        int sLen = s.length();
	        int tLen = t.length();
	        
	        if(sLen != tLen) return false;
	        if(sLen==0) return true;
	        
	        StringBuilder res = new StringBuilder();
	        Map map = new HashMap();
	        
	        for(int i=0;i<sLen;i++){
	        	char tmp = s.charAt(i);
	        	char value = t.charAt(i);
	        	if(map.containsKey(tmp)){
	        		res.append(map.get(tmp));
	        	}else{
	        		if(map.containsValue(value)){
	        			value='-';
	        		}
	        		map.put(tmp,value);
	        		res.append(value);
	        	}
	        }
	        
	        System.out.println(res+","+res.length());
	        return res.toString().equals(t);
	    }
	}
	
	public static void main(String[] args){
		IsomorphicString.Solution solu = new IsomorphicString().new Solution();
		String s = "ebb";
		String t = "baa";
		
		boolean res = solu.isIsomorphic(s, t);
		System.out.println(res);
	}
}
