package leetcode.easy;

public class LastWordLen {

	public static void main(String args[]){
		String s ="   ";
		new LastWordLen().lengthOfLastWord(s);
	}
	
	public int lengthOfLastWord(String s) {
		
		String ss[] = s.split(" ");
		if(ss.length>0){
		String tmp = ss[ss.length-1];
		System.out.println(tmp.length());
		return tmp.length();
		}else{
			System.out.println(0);
			return 0;
		}
	}
}
