package leetcode.easy;


public class HouseRobber {

	public class Solution {
		
		/**
		 * 不能抢相邻的两个马
		 * example: 2,1,1,2 -> 4
		 * @param num
		 * @return
		 */
		public int rob(int[] num) {
			
			int len = num.length;
			int[] result = new int[len];
			
			if(len<2){
				return len==0?0:num[0];
			}
			
			result[0] = num[0];
			result[1] = num[0]>num[1]?num[0]:num[1];
			
			for(int i=2;i<len;i++){
				result[i] = result[i-2]+num[i];
				result[i] = result[i]>result[i-1]?result[i]:result[i-1];
			}
			return result[len-1];
		}
	}

	public static void main(String[] args) {
		HouseRobber.Solution solu = new HouseRobber().new Solution();
		int[] num = {2,1,1,2};
		int result = solu.rob(num);
		System.out.println(result);
	}
}
