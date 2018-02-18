// Source : https://leetcode.com/problems/min-stack/
// Author : Kyon Huang
// Date   : 2018-02-18

class MinStack {
    long min = Integer.MAX_VALUE;
    Stack<Long> stack = new Stack<>();
    public MinStack() {}
    
    public void push(int x) {
        stack.push((long)x-min);
        min = Math.min(x, min);
    }
    
    public void pop() {
        min = Math.max(min - stack.pop(), min);
    }
    
    public int top() {
        return (int)Math.max(stack.peek() + min, min);
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */