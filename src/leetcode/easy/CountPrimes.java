package leetcode.easy;

import java.util.Arrays;

public class CountPrimes {

	/**
	 * 质数除2外其他都只能是奇数；都只能写成6n+1,6n+5的形式除2,3外;
	 * 
	 * @author corny
	 * 
	 */
	public class Solution {

		/**
		 * 试除法
		 * 
		 * @param n
		 * @return
		 */
		public int countPrimes(int n) {
			int count = 1;

			if (n <= 2)
				return 0;
			if (n == 3)
				return 1;

			for (int i = 3; i < n; i += 2) {

				boolean isPrime = true;

				if (i == 3 || i == 5 || i == 7) {
					count++;
					continue;
				}
				if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
					continue;

				if (i % 6 == 1 || i % 6 == 5) {
					int tmp = (int) Math.sqrt(i);
					for (int j = 3; j <= tmp; j += 2) {
						// System.out.print(i+","+j);
						if (i % j == 0) {
							isPrime = false;
							// System.out.println("i,j:"+i+","+j);
							break;
						}
					}

					if (isPrime) {
						// System.out.print(i+",");
						count++;
					}
				}

			}
			System.out.println("count:" + count);
			return count;
		}

		
		/**
		 * 筛选法：从最小质数开始，去掉所有2的倍数，去掉3的倍数，去掉5的倍数...剩下的是质数
		 * @param n
		 * @return
		 */
		public int countPrimes2(int n) {
			long begin = System.currentTimeMillis();
			if (n < 3){
				return 0;
			}

			int sqrt = (int) Math.sqrt(n);
			boolean[] isPrimes = new boolean[n];//boolean默认为false
			Arrays.fill(isPrimes, 2, n, true);
			
//			for(int i=3;i<n;i++){
//				if(i%2==0){
//					isPrimes[i]=false;
//				}
//			}
			
			for (int i = 2; i <= sqrt; i++) {

				if (isPrimes[i]) {
					for (int j = 2 * i; j < n; j += i) {
						isPrimes[j] = false;
					}
				}
			}

			int count = 0;
			for(int i=2;i<n;i++){
				if(isPrimes[i]){
					count++;
				}
			}
			System.out.println(count);
			long time = System.currentTimeMillis() - begin;
			System.out.println(time);
			return count;
		}
	}

	public static void main(String[] args) {
		CountPrimes.Solution solu = new CountPrimes().new Solution();
//		 int num = 5;
//		 int num = 100; //25
//		 int num = 10000; //1229
//		int num = 100000; // 9592
		int num = 1000000; //78498
		 solu.countPrimes2(num);
	}

}
