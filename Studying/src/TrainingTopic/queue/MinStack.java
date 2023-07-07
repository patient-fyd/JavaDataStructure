package TrainingTopic.queue;

import java.util.Stack;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈
 */
class MinStack {

    private Stack<Integer> stack1;
    private Stack<Integer> minStack;

    public MinStack() {
        stack1 = new Stack<>();
        minStack = new Stack<>();
    }

    /**
     * 默认入栈到stack1中,如果minStack为空，或者val小于等于minStack的栈顶元素，入栈到minStack中
     * @param val
     */
    public void push(int val) {
        stack1.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    /**
     * 出栈时，如果stack1的栈顶元素等于minStack的栈顶元素，minStack也出栈
     */
    public void pop() {
        if (stack1.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public int top() {
        return stack1.peek();
    }

    /**
     * 获取最小元素
     * @return
     */
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
    }
}