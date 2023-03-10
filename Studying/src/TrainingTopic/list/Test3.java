package TrainingTopic.list;

import TrainingTopic.list.ListNode;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * @DateTime: 2023/1/28 16:44
 */
public class Test3 {
    /**
     * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
     * 如果有两个中间结点，则返回第二个中间结点。
     * 快慢指针
     * @return 返回slow
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow  = slow.next;
        }
        return slow;
    }
}
