package MyLinkedlist;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/2/28 20:42
 */
public class MyLinkedList {
    static class ListNode{
        public  int val;
        //前驱
        public ListNode prev;
        //后继
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode last;

    public void display(){
        ListNode cur = head;
        while(cur != null){
            System.out.println(cur.val+" ");
            cur = cur.next;
        }
    }

    /**
     * 头插法
     * @param data 要插入的数据
     */
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
            last = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    /**
     * 尾插法
     * @param data 要插入的数据
     */
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
        } else {
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    /**
     * 任意位置插入,第一个数据节点为0号下标
     * @param index 插入的位置
     * @param data 插入的数据
     */
    public void addIndex(int index,int data){
        if (index < 0 || index > size()){
            System.out.println("index不合法");
            return;
        }
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == size()){
            addLast(data);
            return;
        }
        // cur拿到了index下标的节点的地址
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);

        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }

    /**
     * 返回下标的地址
     * @param index 要返回地址的位置
     * @return 返回地址
     */
    private  ListNode searchIndex(int index){
        ListNode cur = head;
        while(index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    /**
     * 查找是否包含关键字key是否在单链表当中
     * @param key 要查找的关键字
     * @return 返回true或false
     */
    public boolean contains(int key){
        ListNode cur = head;
        while(cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除第一次出现关键字为key的节点
     * @param key 要删除的关键字
     */
    public void remove(int key){
        ListNode cur = head;
        while(cur != null){
            if (cur.val == key){
                //判断当前是不是头节点
                if (cur == head){
                    head = head.next;
                    head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        last = last.prev;
                    }
                }
                return;
            }else{
                cur = cur.next;
            }
        }
    }

    /**
     * 删除所有值为key的节点
     * @param key 要删除的值
     */
    public void removeAllKey(int key){
        ListNode cur = head;
        while(cur != null){
            if (cur.val == key){
                //判断当前是不是头节点
                if (cur == head){
                    head = head.next;
                    head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        last = last.prev;
                    }
                }
                cur = cur.next;
            }else{
                cur = cur.next;
            }
        }
    }

    /**
     * 得到单链表的长度
     * @return 返回长度
     */
    public int size(){
        int count = 0;
        ListNode cur = head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void clear(){
        ListNode cur = head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curNext;
        }
        head = null;
        last = null;
    }

}
