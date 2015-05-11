package leetcode.medium;

public class SingleNumber2 {

	public class Solution {
	    public int singleNumber(int[] nums) {
	        int res=0;
	        int len = nums.length;
	        if(len == 1) return nums[0];
	        int[] count=new int[32];
	        
	        for(int i=0;i<32;i++){
	        	for(int j=0;j<len;j++){
	        		count[i] += ((nums[j]>>i) & 1);
	        	}
	        	
	        	res += ((count[i]%3)<<i);
	        }
	        System.out.println(res);
	        return res;
	    }
	}
	
	public static void main(String[] args){
		System.out.println("&:"+(2&0)+",~:"+(~2)+",^:"+(2^0)+",|:"+(2|0));
		
		System.out.println((~(-2))+","+(~(-1))+","+(~0)+","+(~1)+","+(~2)+","+(~3));
		
		SingleNumber2.Solution solu = new SingleNumber2().new Solution();
		int[] nums = {1,1,2,3,4,5,6,2,3,4,5,6,7,6,6,5,4,3,2,1,5,4,3,2,1};
		solu.singleNumber(nums);
	}
}
