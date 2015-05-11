package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

	public class Solution {

		/**
		 * Given a string containing only digits, restore it by returning all
		 * possible valid IP address combinations example: Given
		 * "25525511135",return ["255.255.11.135", "255.255.111.35"]. (Order
		 * does not matter)
		 * @param s 每次递归的输入字符串
		 * @param num 已有ip字段个数,如255.255. num=2; 255.255.11.时num=3
		 * @param ipAddress 
		 * @param result
		 * @return 
		 */
		boolean dfs(String s, int num, String ipAddress,ArrayList<String> result) {
			if (s.length() == 0) {
				return false;
			}

			System.out.println(s + "," + num + "," + ipAddress + ","
					+ result.size());

			if (num == 3) {
				int addressNum = Integer.parseInt(s);
				if (s.charAt(0) == '0') {
					
					//保证最后一个字段第一个数为0时，只出现0不出现00或者000等情况
					if (!(s.length() == 1 && addressNum == 0))
						return false;
				}
				if (addressNum <= 255) {
					ipAddress = ipAddress + s;
					result.add(ipAddress);
					return true;
				} else {
					return false;
				}
			} else {
				if (s.length() >= 1) {
					dfs(s.substring(1), num + 1,
							ipAddress + s.substring(0, 1) + ".", result);
				}

				//保证两个数字时不出现如.01./.00.的情况，不以0开头
				if (s.length() >= 2 && s.charAt(0) != '0') {
					dfs(s.substring(2), num + 1,
							ipAddress + s.substring(0, 2) + ".", result);
				}
				//保证3个数字时不出现如.011.的情况
				if (s.length() >= 3 && s.charAt(0) != '0') {
					int addressnum = Integer.parseInt(s.substring(0, 3));
					if (addressnum <= 255) {
						dfs(s.substring(3), num + 1,
								ipAddress + s.substring(0, 3) + ".", result);
					}
				}
			}
			return true;
		}

		public ArrayList<String> restoreIpAddresses(String s) {
			ArrayList<String> result = new ArrayList<String>();

			if (s == null || s.length() > 12 || s.length()<4) {
				return result;
			}
			dfs(s, 0, "", result);
			return result;
		}
	}

	public static void main(String[] args) {
		RestoreIPAddresses.Solution solu = new RestoreIPAddresses().new Solution();
		String s = "2552";
		List<String> res = solu.restoreIpAddresses(s);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
}
