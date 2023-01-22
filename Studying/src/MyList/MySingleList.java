package MyList;


/**
 * @Author: patient.fyd@gmail.com
 * @Description: 实现链表的基本操作
 * @DateTime: 2023/1/19 0:25
 */
public class MySingleList {

    static class ListNode {
        // 数值域
        public int value;
        // 下个个节点的地址
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    /**
     * 代表单链表的头节点的引用
     */
    public ListNode head;

    /**
     * 这里只是简单的进行链表的构造
     */
    public void createList() {
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(17);
        ListNode listNode3 = new ListNode(22);
        ListNode listNode4 = new ListNode(43);
        ListNode listNode5 = new ListNode(55);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        this.head = listNode1;
    }

    /**
     * 头插法，在链表的头部插入数据
     * @param data 要插入的数据
     */
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    /**
     * 尾插法，在链表的尾部插入数据
     * @param data 要插入的数据
     */
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    /**
     * 任意位置插入,第一个数据节点为0号下标
     * @param index 要插入数据的位置
     * @param data 要插入的数据
     */
    public void addIndex(int index,int data){
        checkIndexAdd(index);
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        // 找到index-1的节点，要插入的位置要知道上一个位置的next
        ListNode cur = this.head;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 检查插入位置的合法性
     * @param index 要插入的位置
     */
    private void checkIndexAdd(int index) {
        if (index < 0 || index > size()) {
            throw new MySingleListIndexOutOfException("插入位置不合法");
        }
    }

    /**
     * 查找是否包含关键字key是否在单链表当中
     * @param key 要去查找的关键字
     * @return 找到了返回ture
     */
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.value == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除第一次出现关键字为key的节点
     * @param key 删除的数据
     */
    public void remove(int key){

        if (this.head == null) {
            System.out.println("链表为空，不能删除！");
            return;
        }
        if(this.head.value == key) {
            this.head = this.head.next;
            return;
        }
        ListNode cur = this.head;
        while (cur.next != null) {
            if(cur.next.value == key) {
                ListNode del = cur.next;
                cur.next = del.next;
                return;
            }
            cur = cur.next;
        }
    }


    /**
     * 删除所有值为key的节点
     * @param key 要删除的数据
     */
    public void removeAllKey(int key){

        if (head == null) {
            return;
        }
        ListNode cur = this.head.next;
        ListNode prev = this.head;

        while (cur != null) {
            if (cur.value == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.value == key){
            head = head.next;
        }
    }

    /**
     * 得到单链表的长度
     * @return 返回单链表的长度
     */
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /**
     * 回收链表的所有的节点
     */
    public void clear(){
        //this.head = null; //比较粗暴
        ListNode cur = this.head;
        ListNode curNext = null;
        while (cur != null) {
            curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        head = null;
    }

    /**
     * 打印链表
     */
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 反转链表，返回一个新头节点
     * @return
     */
    public ListNode reverseList() {
        if(head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }

    /**
     * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
     * 如果有两个中间结点，则返回第二个中间结点。
     * 快慢指针
     * @return 返回slow
     */
    public ListNode middleNode() {
        ListNode slow = head;
        ListNode fast = head;
        if (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow  = slow.next;
        }
        return slow;
    }

    /**
     * 输入一个链表，输出该链表中倒数第k个结点
     * @param k
     * @return
     */
    public ListNode FindKthToTail(int k) {
        if (k <= 0) {
            return null;
        }
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-1 > 0) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            k--;
        }
        // fast已经走了k-1步了
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
