package leetcode.medium;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public class Solution {
	    public double findMedianSortedArrays(int A[], int B[]) {
	    	int alen = A.length;
	    	int blen = B.length;
	    	double res = 0.0;
	    	
	    	int[] tmp = new int[alen+blen];
	    	System.arraycopy(A, 0, tmp, 0, alen);
	    	System.arraycopy(B, 0, tmp, alen, blen);
//	    	
	    	Arrays.sort(tmp);

//	    	for(int i=0;i<tmp.length;i++){
//	    		System.out.println(tmp[i]);
//	    	}
	    	int mid=0;
	    	
	    	if((alen+blen)%2!=0){
	    		mid = (alen+blen)/2;
	    		res = tmp[mid];
	    	}else{
	    		mid = (alen+blen)/2;
	    		res = (tmp[mid]+tmp[mid-1])/2.0;
	    	}
	    	System.out.println(res);
			return res;
	    }
	    
	    public int[] mergeTwoSortedArrays(int A[], int B[]){
	    	int alen = A.length;
	    	int blen = B.length;
	    	int[] res = new int[alen+blen];
	    	
	    	
	    	
	    	return res;
	    }
	}
	
	public static void main(String[] args){
		MedianofTwoSortedArrays.Solution solu = new MedianofTwoSortedArrays().new Solution();
		int[] A={};
		int[] B={2,3};
		solu.findMedianSortedArrays(A, B);
	}
}
