package TrainingTopic.queue;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 不用辅助栈实现最小栈 用链表实现 一个节点中存放当前元素和当前栈中最小元素
 * @DateTime: 2023/7/8 0:29
 */
public class MinStack2 {
    class Node {
        public int val;
        public int min;
        public Node next;

        /**
         * @param val 入栈的元素
         * @param min 栈中最小元素
         */
        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public Node head;
    public int usedSize;

    /**
     * 入栈
     *
     * @param val 入栈的元素
     */
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val);
        } else {
            // 保证每个节点都有一个最小值
            Node node = new Node(val, Math.min(val, head.min));
            node.next = head;
            head = node;
        }
        usedSize++;
    }

    /**
     * 出栈
     *
     * @return 返回元素，并在栈中删除该元素
     */
    public int pop() {
        if (empty()) {
            throw new RuntimeException("栈为空");
        }
        int ret = head.val;
        head = head.next;
        usedSize--;
        return ret;
    }

    public boolean empty() {
        return usedSize == 0;
    }

    /**
     * 获取栈顶元素，不删除
     *
     * @return 返回元素，不删除
     */
    public int top() {
        if (empty()) {
            throw new RuntimeException("栈为空");
        }
        return head.val;
    }

    /**
     * 获取栈中最小元素
     *
     * @return 返回栈中最小元素
     */
    public int getMin() {
        if (empty()) {
            throw new RuntimeException("栈为空");
        }
        return head.min;
    }
}
