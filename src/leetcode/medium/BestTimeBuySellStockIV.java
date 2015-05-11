package leetcode.medium;

import java.util.Arrays;

public class BestTimeBuySellStockIV {

	/**
	 * not AC -- Wrong Answer
	 * @author corny
	 *
	 */
	public class Solution {

		public int maxProfit(int k, int[] prices) {
			int max = 0;
			int len = prices.length;
			
			if(len<1) return 0;
			
			int index = prices[0];
			int count = 0;
			int[] result = new int[len];

			for (int i = 1; i < len; i++) {
				if (prices[i] >= prices[i - 1]){
					continue;
				}else {
						int profit = prices[i-1] - index;
						if(profit > 0){
							result[count++]=profit;
						}
						index = index < prices[i]?index:prices[i];
						
						System.out.println(max + ", index=" + index + ", count=" + count);
				}
			}
			
			result[count++] = prices[len-1] - index;
			Arrays.sort(result);
			
			System.out.println(result.length);
			int tmp = result.length;
			int end = (tmp-k)>0?(tmp-k):0;
			
			for(int i=tmp-1;i>=0;i--){
				System.out.print(result[i]+" ");
				max += result[i];
			}
			return max;
		}
	}

	public static void main(String[] args) {
		BestTimeBuySellStockIV.Solution solu = new BestTimeBuySellStockIV().new Solution();
		int[] prices = {1,2,4,2,5,7,2,4,9,0};
		int res = solu.maxProfit(2, prices);
		System.out.println(res);
	}
}
