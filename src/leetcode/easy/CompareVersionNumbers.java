package leetcode.easy;

public class CompareVersionNumbers {

	public class Solution {

		/**
		 * If version1 > version2 return 1, if version1 < version2 return -1,
		 * otherwise return 0 example: 0.1 < 1.1 < 1.2 < 13.37
		 * 
		 * @param version1
		 * @param version2
		 * @return
		 */
		public int compareVersion(String version1, String version2) {

			// System.out.println(version1.length() + ", "+version2.length());
			if (version1.length() < 1 || version2.length() < 1)
				return 0;

			String[] v1 = version1.split("\\.");
			String[] v2 = version2.split("\\.");
			
			int len1 = v1.length;
			int len2 = v2.length;
			
//			System.out.println(len1+","+len2);
			
			int min,max;
			
			if(len1>len2){
				min = len2;
				max = len1;
			}else{
				min = len1;
				max = len2;
			}
			
			for(int i=0;i<min;i++){
				if(Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])){
					return 1;
				}else if(Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])){
					return -1;
				}else{
					continue;
				}
			}
			for(int j=min;j<max;j++){
				if(min < len1){
					if(Integer.valueOf(v1[j])>0) return 1;
					else continue;
				}else{
					if(Integer.valueOf(v2[j])>0) return -1;
					else continue;
				}
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		CompareVersionNumbers.Solution solu = new CompareVersionNumbers().new Solution();
		int res = solu.compareVersion("01.1.1.0", "1.1.1.0.0.0.1");
		System.out.println(res);
	}
}
