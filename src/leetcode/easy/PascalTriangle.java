package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public class Solution {

		public List<List<Integer>> generate(int numRows) {
			List<List<Integer>> lists = new ArrayList<List<Integer>>();
			List<Integer> curSubList;

			for (int i = 0; i < numRows; i++) {
				curSubList = new ArrayList<Integer>();
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						curSubList.add(1);
					} else {
						int pre = lists.get(i - 1).get(j)
								+ lists.get(i - 1).get(j - 1);
						curSubList.add(pre);
					}
				}
				lists.add(curSubList);
			}
			return lists;
		}
	}

	public static void testArrayListAdd(){
		List<Integer> sub1 = new ArrayList<Integer>();
		sub1.add(0, 1);
		sub1.add(1,1);
		
		sub1.add(3);
		sub1.add(2);
		
		for (int j = 0; j < sub1.size(); j++) {
			System.out.println(sub1.get(j));
		}
	}
	
	public static void testSubArrayList() {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> sub1 = new ArrayList<Integer>();
		sub1.add(0, 1);

		List<Integer> sub2 = new ArrayList<Integer>();
		sub2.add(0, 1);
		sub2.add(1, 2);
		sub2.add(2, 1);

		lists.add(0, sub1);
		lists.add(1, sub2);

		for (int i = 0; i < lists.size(); i++) {
			for (int j = 0; j < lists.get(i).size(); j++) {
				System.out.print(lists.get(i).get(j));
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		PascalTriangle.Solution solu = new PascalTriangle().new Solution();
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		lists = solu.generate(5);
		// System.out.println(lists.size());
		for (int i = 0; i < lists.size(); i++) {
			for (int j = 0; j < lists.get(i).size(); j++) {
				System.out.print(lists.get(i).get(j)+" ");
			}
			System.out.println();
		}

		// testArrayList();
		testArrayListAdd();

	}
}
