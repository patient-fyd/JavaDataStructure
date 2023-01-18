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

    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        System.out.println();
    }

}
