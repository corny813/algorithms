package leetcode.medium;

import java.util.HashMap;

public class TwoSum {

	public class Solution {
	    public int[] twoSum(int[] numbers, int target) {
	        
	        int[] result=new int[2];
	        HashMap<Integer,Integer> nums = new HashMap<Integer,Integer>();
	        
	        if(numbers.length==0||numbers==null){
	            return null;
	        }
	        if(numbers.length==1){
	            if(numbers[0]==target){
	                result[0]=1;
	            }else{
	                return null;
	            }
	        }
	        Integer a;
	        for(int i=0;i<numbers.length;i++){
	            a = nums.get(numbers[i]);
	            if(a==null){
	                nums.put(numbers[i],i);
	            }
	            a=nums.get(target-numbers[i]);
	            if(a!=null && a<i){
	            	
	                result[0]=a+1;
	                result[1]=i+1;
	            }
	        }
	        return result;
	    }
	}
	
	public static void main(String[] args){
		TwoSum.Solution solu = new TwoSum().new Solution();
		int[] numbers={3,2,4};
		int target=5;
		int[] res = solu.twoSum(numbers, target);
		
		System.out.println(res[0]+","+res[1]);
	}
}
