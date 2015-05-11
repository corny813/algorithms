package leetcode.easy;

public class HammingWeight {

	public class Solution{
		
		//1101 hamming weight is 3; 1100 hamming weight is 2
		
		public int hammingWeight(int n){
			int result=0;
			while(n!=0){
				n=n&(n-1);
				result++;
			}
			return result;
		}
	}
	
	public static void main(String[] args){
		HammingWeight.Solution solu = new HammingWeight().new Solution();
		int result = solu.hammingWeight(11);
		System.out.println(result);
	}
}
