package leetcode.easy;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Stack;

public class ValidParentheses {

	public class Solution {
		
		/**
		 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']'
		 * determine if the input string is valid.
		 * @param s
		 * @return
		 */
	    public boolean isValid(String s) {
	        Stack stack = new Stack();
	        int len = s.length();
	        if(len < 1) return true;
	        
//	        char cur;
//	        char top = 0;
	        
	        for(int i=0;i<len;i++){
	        	char cur = s.charAt(i);
	        	
	        	if(stack.isEmpty()){
	        		if(cur==')' || cur=='}' || cur==']'){
	        			return false;
	        		}
	        	}
	        	
	        	char top = 0;
	        	
	        	if(!stack.isEmpty()){
	        		top = (char)stack.peek();
	        	}
	        	
        		if(cur==')' && top=='('){
        			stack.pop();
        		}else if(cur=='}' && top=='{'){
        			stack.pop();
        		}else if(cur==']' && top=='['){
        			stack.pop();
        		}else{
        			stack.push(cur);
        		}
	        }
	        
//	        for(int i=0;i<stack.size();i++){
//	        	System.out.println(stack.get(i));
//	        }
	        
	        return stack.isEmpty();
	    }
	}
	
	public static void main(String[] args){
		ValidParentheses.Solution solu = new ValidParentheses().new Solution();
		String s = "[";
		boolean isValid = solu.isValid(s);
		System.out.println(isValid);
		
		float a = (float) 10.01;
		float b = (float) 9.60;
		BigDecimal bd = new BigDecimal(10.00);
		BigDecimal bd2 = new BigDecimal(9.6);
		NumberFormat nf = new DecimalFormat("#.###");
		
		System.out.println(a-b);
		System.out.println(bd.subtract(bd2));
		System.out.println(nf.format(a-b));
	}
}
