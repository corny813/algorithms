package leetcode.easy;

import java.util.Arrays;

public class CountPrimes {

	/**
	 * ������2��������ֻ������������ֻ��д��6n+1,6n+5����ʽ��2,3��;
	 * 
	 * @author corny
	 * 
	 */
	public class Solution {

		/**
		 * �Գ���
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
		 * ɸѡ��������С������ʼ��ȥ������2�ı�����ȥ��3�ı�����ȥ��5�ı���...ʣ�µ�������
		 * @param n
		 * @return
		 */
		public int countPrimes2(int n) {
			long begin = System.currentTimeMillis();
			if (n < 3){
				return 0;
			}

			int sqrt = (int) Math.sqrt(n);
			boolean[] isPrimes = new boolean[n];//booleanĬ��Ϊfalse
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
