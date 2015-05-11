package leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {
	
	HashMap<Character,Integer> romanToIntMap = new HashMap<Character,Integer>();
			
	public void initMap(){
		romanToIntMap.put('I', 1);
		romanToIntMap.put('V', 5);
		romanToIntMap.put('X', 10);
		romanToIntMap.put('L', 50);
		romanToIntMap.put('C', 100);
		romanToIntMap.put('D', 500);
		romanToIntMap.put('M', 1000);
	}
	public int romanToInt(String s) {
		initMap();
		int result = 0;
		int len = s.length();
		int i =0;
		while(i < len){
			if(s.charAt(i)=='I'||s.charAt(i)=='X'||s.charAt(i)=='C'){
				if( (i+1)<len && romanToIntMap.get(s.charAt(i))<romanToIntMap.get(s.charAt(i+1))){
					result += (romanToIntMap.get(s.charAt(i+1))-romanToIntMap.get(s.charAt(i)));
					i+=2;
					continue;
				}
			}
			result += romanToIntMap.get(s.charAt(i));
			i++;
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String args[]){
		String s = "XCIX"; //99
		String s1 = "XLV"; //45
		String s2 = "IV";  //4
		String s3 = "XXV"; //25
		
		RomanToInteger rti = new RomanToInteger();
		rti.romanToInt(s);
		rti.romanToInt(s1);
		rti.romanToInt(s2);
		rti.romanToInt(s3);
	}
}
