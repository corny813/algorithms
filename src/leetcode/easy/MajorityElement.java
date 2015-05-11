package leetcode.easy;

import java.util.Arrays;

public class MajorityElement {

	public class Solution {

		public int majorityElement(int[] num) {
			// O(nlogn)
			Arrays.sort(num);
			return num[num.length / 2];
		}

		public int majorityElement2(int[] num) {
			// O(1) space and O(n) time
			int[] bits = new int[32];
			
			for (int n : num) {
				update(bits, n);
			}
				
			int res = 0;
			for (int i = 0; i < 32; i++) {
				if (bits[i] > (num.length / 2)) {
					res = res | (1 << i); // 3|5 equals 7 , 011 | 101 = 111
				}
			}
			return res;
		}

		public void update(int[] bits, int n) {
			for (int i = 0; i < 32; i++) {
				if (((n >> i) & 1) > 0)
					bits[i] += 1;
			}
		}
	}
	
	public static void main(String[] args){
		MajorityElement.Solution solu = new MajorityElement().new Solution();
		int[] num={1,2,5,5};
		int res = solu.majorityElement(num);
		System.out.println(res);
	}
}
