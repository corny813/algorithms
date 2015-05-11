package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {

	
	/**
	 * �����г�һ����ֻ����һ���⣬���������������Σ��ҳ��Ǹ�ֻ����һ�ε���
	 * ˼·1: ��������ͳ��ÿ�������ֵĴ���
	 * ˼·2: ������������������ͬ�������Ϊ�㣬ʣ�µ�����Ϊ����
	 * @author corny
	 *
	 */
	public class Solution {
		
	    public int singleNumber(int[] nums) {
	        int len = nums.length;
	        int target = 0;
	        
	        if(len <= 1) return nums[0];
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<len;i++){
	        	int tmp = nums[i];
	        	if(map.containsKey(tmp)){
	        		map.put(tmp, map.get(tmp)+1);
	        	}else{
	        		map.put(tmp, 1);
	        	}
	        }
	        
	        Iterator iter = map.keySet().iterator();
	        while(iter.hasNext()){
	        	Object tmp = iter.next();
	        	 if(map.get(tmp).equals(1)){
	        		 target = (int) tmp;
	        		 System.out.println(target);
	        	 }
	        }
	        return target;
	    }
	    
	    /**
	     * �Ƚϵó���ʹ��foreach��forѭ����ʱ
	     * @param nums
	     * @return
	     */
	    public int singleNumber2(int[] nums){
	    	int res = 0;
	    	int res2 = 0;
	    	int total = 10*10000*10000;
	    	int len = nums.length;
	    	
	    	long begin = System.currentTimeMillis();
	    	for(int i=0;i<total;i++){
	    	for(int num : nums){
	    		res ^= num;
	    	}
	    	}
	    	long time1 = System.currentTimeMillis();
	    	for(int j=0;j<total;j++){
	    	for(int num : nums){
	    		res = res ^ num;
	    	}
	    	}
	    	long time2 = System.currentTimeMillis();
	    	for(int j=0;j<total;j++){
		    	for(int k=0;k<len;k++){
		    		res ^= nums[k];
		    	}
	    	}
	    	long time3 = System.currentTimeMillis();
	    	System.out.println((time1-begin)+"--"+(time2-time1)+"--"+(time3-time2));
	    	return res;
	    }
	}
	
	public static void main(String[] args){
		SingleNumber.Solution solu = new SingleNumber().new Solution();
		int[] nums = {1,2,3,4,5,6,7,6,5,4,3,2,1};
		int res = solu.singleNumber(nums);
		System.out.println(res);
		solu.singleNumber2(nums);
//		System.out.println(2^1);
		
	}
}
