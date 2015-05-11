package leetcode.medium;

public class Sqrtx {

	public class Solution {

		/**
		 * x^2-n=0求n的平方根
		 * 切线方程: f(xi) = xi+f'(xi)(x-xi) => xi+1= (xi + n/xi)/2
		 * @param x
		 * @return
		 */
		public int sqrt(int x){
			
			if(x<=1) return x;
			int low = 1;
			int high = x;
			
			while(low<=high){
//				int mid = low + ((high-low)>>1);
				int mid = (low + high)>>1;
				
				if(mid == x/mid){
					return mid;
				}else if(mid < x/mid){
					low = mid + 1;
				}else{
					high = mid - 1;
				}
			}
			return high;
		}
		
		public int sqrt2(int x) {
			if (x == 0)
				return 0;
			int left = 1;
			int right = Integer.MAX_VALUE;

			while (true) {
				int mid = left + (right - left) / 2;
//				int mid = (left + right)/2; //如果left和right很大，容易超出int范围
				if (mid > x / mid) {
					right = mid - 1;
				} else {
					if (mid + 1 > x / (mid + 1))
						return mid;
					left = mid + 1;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Sqrtx.Solution solu = new Sqrtx().new Solution();
		int res = solu.sqrt(-2);
		System.out.println(res);
	}
}
