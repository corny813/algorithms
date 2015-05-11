package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public class Solution {
	    
		/**
		 * For example, given k = 3,Return [1,3,3,1]. 
		 * 思路一:3!/3!, 3!/2! 3!/2!,	容易超出int或long的范围当k比较大的时候
		 * 思路二:
		 * 1 0 0 0
		 * 1 1 0 0
		 * 1 2 1 0
		 * 1 3 3 1	长度为k的数组k[j]=k[j]+k[j-1]
		 * @param rowIndex
		 * @return
		 */
		public List<Integer> getRow(int rowIndex) {
	        List<Integer> resList = new ArrayList<Integer>();
	        for(int i=0;i<=rowIndex;i++){
	        	resList.add(1);
	        	for(int j=i-1;j>0;j--){
	        		resList.set(j, resList.get(j)+resList.get(j-1));
	        	}
	        }
	        for(int digit : resList){
	        	System.out.print(digit+" ");
	        }
	        return resList;
	    }
		
		public int factorial(int k){
			int res = 1;
			for(int i=1;i<=k;i++){
				res *= i;
			}
			if(k==0) res =1;
			return res;
		}
	}
	
	public static void main(String[] args){
		PascalTriangle2.Solution solu = new PascalTriangle2().new Solution();
		solu.getRow(3);
	}
}
