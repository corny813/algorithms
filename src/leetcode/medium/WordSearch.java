package leetcode.medium;

public class WordSearch {

	public class Solution {
		
		/**
		 * Given a 2D board and a word, find if the word exists in the grid
		 * example:
		 * 	["ABCE"],
		 *  ["SFCS"],
		 *  ["ADEE"]
		 *  word = "ABCCED", -> returns true,
		 *  word = "SEE", -> returns true,
		 *  word = "ABCB", -> returns false.
		 * @param board
		 * @param word
		 * @return
		 */
	    public boolean exist(char[][] board, String word) {
	        
	    	if(board == null) return false;
	    	if(word.length()<1) return false;
	    	boolean res = false;
	    	
	    	for(int i=0;i<board.length;i++){
	    		for(int j=0;j<board[i].length;j++){
	    			if(board[i][j]==word.charAt(0)){
	    				System.out.println("i="+i+",j="+j);
	    				res = existAdjacent(board,i,j,word.substring(1));
	    			}
	    			if(res) break;
	    		}
	    		if(res) break;
	    	}
	    	return res;
	    }
	    
	    /**
	     * µÝ¹é¼ì²âÉÏÏÂ×óÓÒÊÇ·ñ·ûºÏ
	     * @param board
	     * @param i
	     * @param j
	     * @param word
	     * @return
	     */
	    private boolean existAdjacent(char[][] board,int i,int j,String word){
	    	
	    	System.out.println(word);
	    	
	    	if(word.length() < 1) return true;
	    	
	    	char ad = word.charAt(0);
	    	System.out.println("ad="+ad);
	    	
	    	char ij = board[i][j];
	    	
	    	board[i][j]='*';
	    	
	    	boolean res = false;
	    	
	    	if(j>0){
	    		char left = board[i][j-1];
	    		System.out.println("left="+left);
	    		if(left!='*' && left==ad){
	    			res = existAdjacent(board,i,j-1,word.substring(1));
	    			System.out.println("left "+res);
	    		}
	    		if(res) return true;
	    	}
	    	if(j<board[0].length-1){
	    		char right = board[i][j+1];
	    		System.out.println("right="+right);
	    		if(right!='*' && right==ad){
	    			res = existAdjacent(board,i,j+1,word.substring(1));
	    			System.out.println("right "+res);
	    		}
	    		if(res) return true;
	    	}
	    	if(i>0){
	    		char up = board[i-1][j];
	    		System.out.println("up="+up);
	    		if(up!='*' && up==ad){
	    			res = existAdjacent(board,i-1,j,word.substring(1));
	    			System.out.println("up "+res);
	    		}
	    		if(res) return true;
	    	}
	    	if(i<board.length-1){
	    		char down = board[i+1][j];
	    		System.out.println("down="+down);
	    		if(down!='*' && down==ad){
	    			res = existAdjacent(board,i+1,j,word.substring(1));
	    			System.out.println("down "+res);
	    		}
	    		if(res) return true;
	    	}
	    	board[i][j]=ij;
	    	return false;
	    }
	}
	
	public static void main(String[] args){
		WordSearch.Solution solu = new WordSearch().new Solution();
//		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
		String word = "AAB";
		boolean res = solu.exist(board, word);
		System.out.println(res);
	}
}
