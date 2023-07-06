package MyQueue;

class MyCircularQueue {
    private int[] elem;
    private int front;
    private int rear;
    private int usedSize;

    /**
     * 构造器，设置队列长度为 k
     *
     * @param k
     */
    public MyCircularQueue(int k) {
        elem = new int[k];
    }

    /**
     * 向循环队列插入一个元素。如果成功插入则返回真
     * 1.判断队列是否满
     * 2.插入元素到rear位置
     * 3.rear++
     *
     * @param value
     * @return
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        elem[rear] = value;
        rear = (rear + 1) % elem.length;
        usedSize++;
        return true;
    }

    /**
     * 从循环队列中删除一个元素。如果成功删除则返回真
     * 1.判断队列是否为空
     * 2.删除front位置元素
     * 3.front++
     *
     * @return
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % elem.length;
        usedSize--;
        return true;
    }

    /**
     * 获取队列头部元素
     *  1.判断队列是否为空
     *  2.返回front位置元素
     *
     * @return
     */
    public int Front() {
        if (isEmpty()) {
            System.out.println(new RuntimeException("队列为空"));
            return -1;
        }
        return elem[front];
    }

    /**
     * 获取队尾元素
     * 1.判断队列是否为空
     * 2.返回rear-1位置元素
     *
     * @return
     */
    public int Rear() {
        if (isEmpty()) {
            System.out.println(new RuntimeException("队列为空"));
            return -1;
        }
        if (rear == 0) {
            return elem[elem.length - 1];
        }
        return elem[rear - 1];
    }

    /**
     * 判断队列是否为空
     * usedSize == 0表示为空
     *
     * @return
     */
    public boolean isEmpty() {
        if (usedSize == 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断队列是否满
     * usedSize == elem.length表示为满
     *
     * @return
     */
    public boolean isFull() {
        if (usedSize == elem.length) {
            return true;
        }
        return false;
    }
}
