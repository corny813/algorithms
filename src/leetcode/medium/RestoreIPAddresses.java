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
		 * @param s ÿ�εݹ�������ַ���
		 * @param num ����ip�ֶθ���,��255.255. num=2; 255.255.11.ʱnum=3
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
					
					//��֤���һ���ֶε�һ����Ϊ0ʱ��ֻ����0������00����000�����
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

				//��֤��������ʱ��������.01./.00.�����������0��ͷ
				if (s.length() >= 2 && s.charAt(0) != '0') {
					dfs(s.substring(2), num + 1,
							ipAddress + s.substring(0, 2) + ".", result);
				}
				//��֤3������ʱ��������.011.�����
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
