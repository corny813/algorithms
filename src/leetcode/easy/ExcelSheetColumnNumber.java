package leetcode.easy;

import java.util.HashMap;

public class ExcelSheetColumnNumber {

	public class Solution {
		private HashMap map;

		public int titleToNumber(String s) {
			int res = 0;
			int len = s.length();
			if (len < 1) return 0;
//			initMap();
			int count=-1;

			while(len-->0){
				count++;
//				res += (int) map.get(s.charAt(len))*((int)Math.pow(26,count));
				res += (s.charAt(len)-'A'+1)*((int)Math.pow(26,count));
			}
			System.out.println(res);
			return res;
		}

		public void initMap() {
			map = new HashMap();//遍历输出的顺序和put的顺序可能不一样
//			map = new LinkedHashMap();//遍历输入的顺序和put的顺序一致
			for (int i = 0; i < 26; i++) {
				char key = (char)('A' + i);
				int value = 1 + i;
//				System.out.println("key:"+key+"--value:"+value);
				map.put(key,value);
			}
			
//			Iterator iter = map.entrySet().iterator();
//			while(iter.hasNext()){
//				Map.Entry entry = (Map.Entry)iter.next();
//				char key = (char) entry.getKey();
//				int value = (int) entry.getValue();
//				System.out.println(key+"--"+value);
//			}
			
		}
	}

	public static void main(String[] args) {
		ExcelSheetColumnNumber.Solution solu = new ExcelSheetColumnNumber().new Solution();
		solu.titleToNumber("AAA");
	}

}
