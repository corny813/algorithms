package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	/**
	 * 19 is a happy number
	 * 1^2 + 9^2 = 82
	 * 8^2 + 2^2 = 68
	 * 6^2 + 8^2 = 100
	 * 1^2 + 0^2 + 0^2 = 1
	 * @author corny
	 *
	 */
	public class Solution {
	    public boolean isHappy(int n) {
//	        System.out.println("ishappy:"+square(19));
	    	int x = n;
	    	int y = n;
	    	while(x > 1){
	    		x = square(x);
	    		if(x==1) return true;
	    		y = square(square(y));
	    		if(y==1) return true;
	    		System.out.println(x+","+y);
	    		if(x==y) return false;
	    	}
	    	return true;
	    }
	    
	    public boolean isHappy2(int n) {
//	        System.out.println("ishappy:"+square(19));
	    	Set set = new HashSet();
	    	int res = n;
	    	while(res > 1){
	    		if(set.contains(res)){
	    			return false;
	    		}else{
	    			set.add(res);
	    		}
	    		System.out.println(res);
	    		res = square(res);
	    	}
	    	return true;
	    }
	    
	    public int square(int num){
	    	int res = 0;
	    	while(num>0){
	    		int digit = num%10;
	    		res += digit*digit;
	    		num /= 10;
	    	}
//	    	System.out.println(res);
	    	return res;
	    }
	}
	
	public static void main(String[] args){
		HappyNumber.Solution solu = new HappyNumber().new Solution();
		boolean flag = solu.isHappy2(2);
		System.out.println(flag);
//		solu.square(19);
	}
}
