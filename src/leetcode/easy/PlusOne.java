package leetcode.easy;

public class PlusOne {

	public class Solution {

		/**
		 * [1][2][3]+1=[1][2][4]
		 * 
		 * @param digits
		 * @return
		 */
		public int[] plusOne(int[] digits) {

			int len = digits.length;
			int[] res = new int[len+1];
			boolean flag = digits[len - 1] >= 9 ? true : false;

			res[len]=(digits[len - 1]+1)%10;
			if(flag) {
				res[len-1]++;
			}
			
			for (int i = len - 2; i >= 0; i--) {
				
				res[i+1] = (res[i+1]+digits[i]);
				
					if (res[i+1] > 9)
						flag = true;
					else
						flag = false;

				System.out.println(flag);
				if (flag) {
					res[i] += 1;
				} 
				res[i + 1] = (res[i+1] ) % 10;

			}

			if (flag) {
				res[0] = 1;
			} else {
				int[] res1 = new int[len];
				for(int i=0;i<len;i++){
					res1[i]=res[i+1];
				}
				res = res1.clone();
			}
			return res;
		}
		
		public int[] plusOne2(int[] digits) {
	        for(int i = digits.length - 1; i >=0; i--){
	            int digit = digits[i] + 1;
	            if(digit < 10){
	                digits[i] = digit;
	                break;
	            } else {
	                digits[i] = digit % 10;
	            } 
	            if(i == 0){
	                int[] oldDigits = digits;
	                digits = new int[digits.length + 1];
	                digits[0] = 1;
	                System.arraycopy(oldDigits, 0, digits, 1, oldDigits.length);
	            }
	        }
	        return digits;
	    }
	}

	public static void main(String[] args) {
		PlusOne.Solution solu = new PlusOne().new Solution();
		int[] digits = { 8, 9, 8, 9 };
		int[] res = solu.plusOne2(digits);

		int i = 0;
		while (i <= res.length - 1) {
			System.out.print(res[i]);
			i++;
		}
	}
}
