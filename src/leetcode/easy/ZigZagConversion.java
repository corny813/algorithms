package leetcode.easy;

public class ZigZagConversion {

	public class Solution {
		
		/**
		 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".		
		 * P   A   H   N 
		 * A P L S I I G
		 * Y   I   R
		 * Ë¼Â·Ò»£º0     2k-2
		 *         .
		 *         .
		 *         k-1   3k-3
		 * @param s
		 * @param nRows
		 * @return
		 */
	    public String convert(String s, int nRows) {
	        int len = s.length();
	        System.out.println(len);
	        StringBuilder[] sb = new StringBuilder[nRows];
	        StringBuilder res = new StringBuilder();
	        
	        if(len<1 || nRows<=1) return s;
	        
	        int loop = 2*nRows-2;
	        int mid = nRows - 1;
	        
	        for(int i=0;i<nRows;i++){
	        	sb[i] = new StringBuilder();
	        }
	        for(int i=0;i<s.length();i++){
	        	sb[mid-Math.abs(i%loop-mid)].append(s.charAt(i));
	        }
	        for(int j=0;j<nRows;j++){
	        	res.append(sb[j]);
	        }
	        System.out.println(res.toString());
	        return res.toString();
	    }
	}
	
	public static void main(String[] args){
		ZigZagConversion.Solution solu = new ZigZagConversion().new Solution();
//		String s = "PAYPALISHIRING";
//		String s = "";
//		String s = "AB";// 1
		String s = "ABC";// 2
		solu.convert(s , 2);
	}
}
