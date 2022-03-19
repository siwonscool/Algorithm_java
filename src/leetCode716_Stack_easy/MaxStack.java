package leetCode716_Stack_easy;

import java.util.Stack;

class MaxStack {
    private Stack<Integer> stack;
    private int maxValue;

    public MaxStack() {
        stack = new Stack<>();
        maxValue = -10000000;
    }

    public void push(int x) {
        stack.push(x);
        if(x >= maxValue){
            maxValue = x;
        }
    }

    public int pop() {
        int popValue = stack.pop();
        findMaxValue();
        return popValue;
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxValue;
    }

    public int popMax() {
        //isEmpty()
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) == maxValue){
                int popValue = stack.remove(i);
                findMaxValue();
                return popValue;
            }
        }
        return maxValue;
    }

    private void findMaxValue(){
        maxValue = -10000000;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) >= maxValue){
                this.maxValue = stack.get(i);
            }
        }
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
