package leetcode.easy;

public class RotateArray {

	public class Solution {
	    public void rotate(int[] nums, int k) {
	        //1234567  k=3 --> 5671234
	    	int len = nums.length;
	    	if(len<k) return;
	    	
	    	int[] tmp =new int[k];
	    	int[] tmp2 = new int[len-k];
	    	nums = reverse(nums).clone();
	    	for(int i=0;i<k;i++){
	    		tmp[i]=nums[i];
	    	}
	    	for(int i=k;i<len;i++){
	    		tmp2[i-k]=nums[i];
	    	}
	    	tmp = reverse(tmp);
	    	tmp2 = reverse(tmp2);
	    	for(int i=0;i<k;i++){
	    		nums[i]=tmp[i];
	    	}
	    	for(int i=k;i<len;i++){
	    		nums[i]=tmp2[i-k];
	    	}
	    	for(int i=0;i<len;i++){
	    		System.out.print(nums[i]+" ");
	    	}
	    }
	    
	    //AC
	    public void rotate2(int[] nums, int k) {
	        int length = nums.length;
	        int[] tmp = new int[length];
	        if (k > length) {
	            k = k % length;
	        }
	        if (k < 0) {
	            k = k % length + length;
	        }
	        for (int i = 0; i < length; i++) {
	            tmp[(i + k) % length] = nums[i];
	        }
	        System.arraycopy(tmp, 0, nums, 0, tmp.length);//nums=tmp
	    }
	    
	    public int[] reverse(int[] nums){
	    	
	    	int len = nums.length;
	    	int[] result = new int[len];
	    	
	    	for(int i=0;i<len;i++){
	    		result[i]=nums[len-1-i];
	    	}
	    	return result;
	    }
	    
	    public void arrayTest(){
	    	int[] nums={1,2,3,4};
//	    	int[] tmp = nums;
	    	int[] tmp = nums.clone();
	    	int len = nums.length;
	    	for(int i=0;i<len;i++){
	    		System.out.println("nums:"+nums[i]+" tmp:"+tmp[i]);
	    	}
	    	tmp[0]=6;
	    	for(int i=0;i<len;i++){
	    		System.out.println("nums:"+nums[i]+" tmp:"+tmp[i]);
	    	}
	    }
	}
	
	public static void main(String[] args){
		RotateArray.Solution solu = new RotateArray().new Solution();
		int[] nums={1,2};
		int k = 1;
//		solu.rotate(nums, k);
		solu.arrayTest();
	}
}
