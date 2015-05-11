package leetcode.medium;

public class MaximumProduct {

	public static void main(String args[]) {
		int arr[] = {3,-1,4};
		MaximumProduct pro = new MaximumProduct();
		pro.proProduct(arr);
	}

	private int proProduct(int[] arr) {
		int pro = 1;
		int max = 1;
		int result[] = new int[arr.length];

		if(arr.length==1){
			return arr[0];
		}
		for (int i = 0; i < arr.length; i++) {
			
		}

		max=result[0];
		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
			if(result[i]>max) max=result[i];
		}
		System.out.println(max);
		return max;
	}

}
