package TrainingTopic.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 */
class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * 入到不为空的队列中
     * 如果都为空，放到que1中
     * @param x
     */
    public void push(int x) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.offer(x);
        } else if (!queue1.isEmpty()) {
            queue1.offer(x);
        } else {
            queue2.offer(x);
        }
    }

    /**
     * 出队列时，将不为空的队列中的元素出队列，放到另一个队列中，直到剩下一个元素，出队列
     * @return
     */
    public int pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return -1;
        }
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        } else {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public int top() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return -1;
        }
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            int val = queue1.poll();
            queue2.offer(val);
            return val;
        } else {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            int val = queue2.poll();
            queue1.offer(val);
            return val;
        }
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean empty() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }
}