package TrainingTopic.queue;

import java.util.Stack;

/**
 * 用栈实现队列
 */
class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * 入队列时，将不为空的栈中的元素出栈，放到另一个栈中，直到剩下一个元素，入栈
     *
     * @param x
     */
    public void push(int x) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            stack1.push(x);
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    /**
     * 出栈时，将不为空的栈中的元素出栈
     *
     * @return
     */
    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if (!stack1.isEmpty()) {
            return stack1.pop();
        } else {
            return stack2.pop();
        }
    }

    /**
     * 获取队列头部元素，返回不为空的栈的栈顶元素
     *
     * @return
     */
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if (!stack1.isEmpty()) {
            return stack1.peek();
        } else {
            return stack2.peek();
        }
    }

    /**
     * 判断队列是否为空，两个栈都为空时，队列为空
     *
     * @return
     */
    public boolean empty() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}
