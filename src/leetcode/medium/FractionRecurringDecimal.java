package leetcode.medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class FractionRecurringDecimal {

	public class Solution {
		
		/**
		 * 分数变小数，如有循环用括号表示，如2/3表示为0.(6)
		 * example:
		 *  2/1 return 2
		 *  1/2 return 0.5
		 *  1/6 return 0.1(6)
		 *  1/99 return 0.(01)
		 *  1/333 return 0.(003)
		 * @param numerator
		 * @param denominator
		 * @return
		 */
	    public String fractionToDecimal(int numerator, int denominator) {
	        StringBuilder sb = new StringBuilder();
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        
	    	return sb.toString();
	    }
	}
	
	public static void main(String[] args){
		
		FractionRecurringDecimal.Solution solu = new FractionRecurringDecimal().new Solution();
		
		int numerator = 1;
		int denominator = 99;
		
		String res = solu.fractionToDecimal(numerator, denominator);
		System.out.println(res);
		
		double a = numerator*1.0;
		double b = denominator*1.0;
		
		long al = 1;
		long bl = 99;
		
		System.out.println(numerator/(denominator));
		System.out.println(al/bl);
	}
}
