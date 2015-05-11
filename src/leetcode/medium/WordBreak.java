package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WordBreak {
	
	StringBuffer sb = new StringBuffer();
	List<String> result = new ArrayList<String>();
	
	public static void main(String args[]) {

		String s = "catsanddog";
		Set dict = new HashSet();
		String d[] = { "cat", "cats", "and", "sand", "dog" };
		for (String t : d) {
			dict.add(t);
		}
//		System.out.println(dict.size());
		WordBreak wb = new WordBreak();
//		Set result = wb.wordBreak(s, dict);
		List<String> list = wb.wordBreakHelper(s, dict, 0);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		// Iterator iter = result.iterator();
		// while(iter.hasNext()){
		// System.out.println(iter.next());
		// }
	}

	public List<String> wordBreak2(String s,Set<String> dict){
	
		return null;
	}
	
	
	public List<String> wordBreak(String s, Set<String> dict) {

		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		int length = s.length();
		String str = null;

		if (s.length() == 0 || s.length() == 1) {
			set.add(s);
			list.add(s);
			return list;
		}

		int start = 0;
		while (start < s.length()) {
			str = s.substring(start);
			System.out.println("str:" + str);
			
			for (String word : dict) {
				int len = word.length();
				if (len > str.length())
					continue;
				System.out.println(len + ":" + word);
				if (str.substring(0, len).equals(word)) {
					start += len;
					System.out.println(word + "-" + start);
//					break;
				}
			}
		}

		return null;
	}
	
public List<String> wordBreakHelper(String s, Set<String> dict, int start){
        
//        sb = new StringBuffer();
//        Set<String> result = new HashSet<String>();
		
        
        if(start >= s.length()) 
            return null;
 
        for(String a: dict){
            int len = a.length();
            int end = start+len;
 
            //end index should be <= string length
            if(end > s.length()) 
                continue;
 
            if(s.substring(start, end).equals(a)){
//            		System.out.println(a+":"+start+"-"+len);
            		
            		
            		
            		if(end == s.length()){
            			sb.append(a);
//            			System.out.println("sb:"+sb);
            			result.add(sb.toString());
//            			System.out.println("size:"+result.size());
            			sb.setLength(0);;
            		}else{
            			sb.append(a+" ");
            		}
                wordBreakHelper(s, dict, end);
            }
        }
        
        return result;
    }
}
