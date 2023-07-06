package MyQueue;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/7/6 22:49
 */
public class MyLinkedList {
    class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head;
    public Node last;
    public int usedSize;

    /**
     * 入队
     *
     * @param val 入队的元素
     */
    public void offer(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        usedSize++;
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }

    /**
     * 出队
     *
     * @return 返回出队的元素
     */
    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int ret = head.val;
        head = head.next;
        // 处理只有一个元素的情况
        if (head == null) {
            last = null;
        }
        usedSize--;
        return ret;
    }

    /**
     * 出队但不删除元素
     * @return 返回队头元素
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }

    public int size(){
        return usedSize;
    }
}
