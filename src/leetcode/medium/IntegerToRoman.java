package leetcode.medium;

import java.util.HashMap;

public class IntegerToRoman {
	
	public class Solution {
		
		HashMap<Integer,String> romanIntMap = new HashMap<Integer,String>();

		public void initMap(){
			romanIntMap.put(1,"I");
			romanIntMap.put(2,"II");
			romanIntMap.put(3,"III");
			romanIntMap.put(4,"IV");
			romanIntMap.put(5,"V");
			romanIntMap.put(6,"VI");
			romanIntMap.put(7,"VII");
			romanIntMap.put(8,"VIII");
			romanIntMap.put(9,"IX");
			
			romanIntMap.put(10,"X");
			romanIntMap.put(20,"XX");
			romanIntMap.put(30,"XXX");
			romanIntMap.put(40,"XL");
			romanIntMap.put(50,"L");
			romanIntMap.put(60,"LX");
			romanIntMap.put(70,"LXX");
			romanIntMap.put(80,"LXXX");
			romanIntMap.put(90,"XC");
			
			romanIntMap.put(100,"C");
			romanIntMap.put(200,"CC");
			romanIntMap.put(300,"CCC");
			romanIntMap.put(400,"CD");
			romanIntMap.put(500,"D");
			romanIntMap.put(600,"DC");
			romanIntMap.put(700,"DCC");
			romanIntMap.put(800,"DCCC");
			romanIntMap.put(900,"CM");
			
			romanIntMap.put(1000,"M");
		}
		
		public String intToRoman(int num) {
	        String M[] = {"", "M", "MM", "MMM"};
	        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
	    }
	}
}
