package leetcode.easy;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args){
		MStack stack = new MStack();
		stack.push(0);
		stack.pop();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		int min = stack.getMin();
		int top = stack.top();
		System.out.println("top:"+top+",min:"+min);
	}
}

class MStack {
	
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	
    public void push(int x) {
    	stack.push(x);
    	if(minStack.isEmpty() || x <= minStack.peek()){
    		minStack.push(x);
    	}
    }

    public void pop() {
    	if(minStack.peek().equals(stack.peek())){
    		minStack.pop();
    	}
    	stack.pop();
    }

    public int top() {
    	return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}