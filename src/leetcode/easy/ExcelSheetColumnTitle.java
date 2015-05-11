package leetcode.easy;

import java.util.HashMap;

public class ExcelSheetColumnTitle {

	public class Solution {

		private HashMap map;

		public String convertToTitle(int n) {
			StringBuilder sb = new StringBuilder();
			initMap();
			while (n > 0) {
				int remain = n % 26;
				n /= 26;
				if(remain==0){
					n -= 1;
				}
				sb.append(map.get(remain));
//				System.out.println(remain);
			}
			System.out.println(sb.reverse().toString());
			return sb.reverse().toString();
		}

		public void initMap() {
			map = new HashMap();// 遍历输出的顺序和put的顺序可能不一样
			// map = new LinkedHashMap();//遍历输入的顺序和put的顺序一致
			for (int i = 0; i < 26; i++) {
				char value = (char) ('A' + i);
				int key = 1 + i;
				// System.out.println("key:"+key+"--value:"+value);
				map.put(key, value);
			}
			map.put(0, 'Z');

			// Iterator iter = map.entrySet().iterator();
			// while(iter.hasNext()){
			// Map.Entry entry = (Map.Entry)iter.next();
			// char key = (char) entry.getKey();
			// int value = (int) entry.getValue();
			// System.out.println(key+"--"+value);
			// }

		}
	}

	public static void main(String[] args) {
		ExcelSheetColumnTitle.Solution solu = new ExcelSheetColumnTitle().new Solution();
		solu.convertToTitle(27);
	}
}
