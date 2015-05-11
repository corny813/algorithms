package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class AddBinary {

	public class Solution {
		
	    public String addBinary(String a, String b) {
	       StringBuffer result =new StringBuffer();
	       
	       System.out.println(result.length());
	       int alen = a.length();
	       int blen = b.length();
	       
	       if(alen>0 && blen>0){
	    	   for(int i=alen-1,j=blen-1;i>=0 && j>=0;i--,j--){
	    		   
	    	   }
	       }else if(alen>0){
	    	   result.append(a);
	       }else{
	    	   result.append(b);
	       }
	       return result.toString();
	    }
	}
	
	public static void main(String[] args){
		AddBinary.Solution solu = new AddBinary().new Solution();
		solu.addBinary("11", "1");
		List list = new ArrayList();
		for(int i=0;i<3;i++){
			list.add(i);
		}
		int mid = (list.size()-1)/2;
		System.out.println(list.subList(0, mid+1).size());//list index >=0 and <mid+1 [0,mid+1)
		System.out.println(list.subList(mid+1, list.size()).size());
	}
}
