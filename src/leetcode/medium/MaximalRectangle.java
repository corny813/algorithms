package leetcode.medium;

public class MaximalRectangle {

	//Wrong Answer not AC
	public class Solution {
	    public int maximalRectangle(char[][] matrix) {
	        
	    	int len = matrix.length;
//	    	System.out.println(len);
	    	if(len<1) return 0;
	    	
	    	int xmin=-1;
	    	int xmax=-1;
	    	int ymin=-1;
	    	int ymax=-1;
	    	
	    	for(int i=0;i<len;i++){
	    		int subLen = matrix[i].length;
	    		
	    		for(int j=0;j<subLen;j++){
	    			if(matrix[i][j]=='1'){
	    				if(ymin==-1){
	    					ymin = i;
	    				}
	    				if(xmin == -1){
	    					xmin = j;
	    				}else{
	    					xmin = xmin<j?xmin:j;
	    				}
	    				ymax = ymax>i?ymax:i;
	    				xmax = xmax>j?xmax:j;
	    				
	    				System.out.println(xmin+","+xmax+";"+ymin+","+ymax);
	    			}
	    		}
	    	}
	    	if(xmin==-1 && ymin==-1 && xmax==-1 && ymax==-1){
	    		System.out.println(0);
	    		return 0;
	    	}
	    	System.out.println((xmax-xmin+1)*(ymax-ymin+1));
	    	return (xmax-xmin+1)*(ymax-ymin+1);
	    }
	}
	
	public static void main(String[] args){
		MaximalRectangle.Solution solu = new MaximalRectangle().new Solution();
		char[] sub = {'0'};
		char[] sub0 = {'0','1'};
		char[] sub1 = {'0','1'};
		char[] sub2 = {'0','0','1'};
		char[][] matrix = {sub};
		solu.maximalRectangle(matrix);
	}
}
