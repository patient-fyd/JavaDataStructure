package MyList;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
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

    //头插法
    public void addFirst(int data){
        
    }
    //尾插法
    public void addLast(int data){

    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){

    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //得到单链表的长度
    public int size(){

    }

    public void clear(){

    }
    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        System.out.println();
    }

}
