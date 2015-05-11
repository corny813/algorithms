package leetcode.easy;

public class CountAndSay {

	public class Solution {
		String countAndSayForOneString(String input) {
			char tmp = input.charAt(0);
			int num = 1;
			StringBuffer newString = new StringBuffer("");
			for (int k = 1; k < input.length(); k++) {
				if (input.charAt(k) == tmp) {
					num++;
					continue;
				}
				newString.append(Integer.toString(num) + tmp);
				tmp = input.charAt(k);
				num = 1;
			}
			newString.append(Integer.toString(num) + tmp);
			return newString.toString();
		}

		public String countAndSay(int n) {
			String result = "1";
			int i = 1;
			while (i < n) {
				result = countAndSayForOneString(result);
				i++;
			}
			return result;
		}
	}

	public static void main(String[] args) {
		CountAndSay cas = new CountAndSay();
		Solution solu = cas.new Solution();
		for (int i = 0; i < 32; i++) {
			String result = solu.countAndSay(i);
			if (result != null) {
				System.out.println(i+"--"+result.length());
			}
		}

	}

}
