package leetcode.medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public class Solution {

		/**
		 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9 
		 * ["4", "13", "5", "/","+"] -> (4 + (13 / 5)) -> 6
		 * 
		 * @param tokens
		 * @return
		 */
		public int evalRPN(String[] tokens) {
			int res = 0;
			int len = tokens.length;
			
			if(len<1) {
//				System.out.println(0);
				return 0;
			}
			
			Stack<String> stack = new Stack<String>();

			for (int i = 0; i < len; i++) {
				if (!isOperator(tokens[i])) {
					stack.push(tokens[i]);
				} else {
					int b = Integer.valueOf(stack.pop());
					int a = Integer.valueOf(stack.pop());
					switch (tokens[i]) {
					case "+":
						stack.push(a + b + "");
						break;
					case "-":
						stack.push(a - b + "");
						break;
					case "*":
						stack.push(a * b + "");
						break;
					case "/":
						stack.push(a / b + "");
						break;
					}

				}
			}
			res = Integer.valueOf(stack.pop());
			System.out.println(res);
			return res;
		}

		public boolean isOperator(String str) {
			if (str.equals("+") || str.equals("-") || str.equals("*")
					|| str.equals("/")) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public static void main(String[] args){
		EvaluateReversePolishNotation.Solution solu = new EvaluateReversePolishNotation().new Solution();
		String[] tokens = {};
		solu.evalRPN(tokens);
	}
}
