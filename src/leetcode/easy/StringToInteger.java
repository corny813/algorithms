package leetcode.easy;

public class StringToInteger {

	public class Solution {
		
		/**
		 * 字符串包含空格、字母；字符串有多于一个的符号；字符表示的数字溢出
		 * @param str
		 * @return
		 */
	    public int myAtoi(String str) {
	    	str = str.trim();
	    	int len = str.length();
	    	long res;
	    	
	    	if(len>0){
	    		System.out.println(str);
	    		res = atoi(str);
	    		System.out.println(res);
	    		if(res >= Integer.MAX_VALUE){
//	    			System.out.println("bigger than max");
	    			return Integer.MAX_VALUE;
	    		}else if(res <= Integer.MIN_VALUE){
//	    			System.out.println("smaller than min");
	    			return Integer.MIN_VALUE;
	    		}else{
//	    			System.out.println("normal");
	    			return (int)res;
	    		}
	    	}else{
	    		return 0;
	    	}
	    }

		private long atoi(String str) {
			int len = str.length();
			long res = 0L;
			int count = 0;
			int signCount = 0;
			
			for(int i=0;i<len;i++){
				char curDigit = str.charAt(i);
				if(signCount>1){
					return 0;
				}
				if(curDigit >= '0' && curDigit <= '9'){
					res = res*10 + Integer.parseInt(curDigit+"");
					if(res > Integer.MAX_VALUE){
						if(count%2!=0){
							return res*(-1);
						}else{
							return res;
						}
					}
//					System.out.println(res+","+curDigit+","+Integer.valueOf(curDigit));
				}else if(curDigit == '-' || curDigit == '+'){
					if(curDigit == '-'){
						count++;
					}
					signCount++;
				}else{
					break;
				}
			}
			if(count%2!=0){
				System.out.println("negative");
				res = res*(-1);
			}
			return res;
		}
	}
	
	public static void main(String[] args){
		StringToInteger.Solution solu = new StringToInteger().new Solution();
//		String str = "+-2"; //return 0 
//		String str = "  -0012a42"; //return -12
//		String str = "9223372036854775809";	//return 2147483647
		String str = "-2147483648"; //return -2147483648
		
		System.out.println("max long:"+Long.MAX_VALUE+", max long +1:"+(Long.MAX_VALUE+1));
		int res = solu.myAtoi(str);
		System.out.println(res);
	}
}
