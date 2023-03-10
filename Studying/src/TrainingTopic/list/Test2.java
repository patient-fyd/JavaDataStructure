package TrainingTopic.list;

import TrainingTopic.list.ListNode;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 输入一个链表，输出该链表中倒数第k个结点
 * @DateTime: 2023/1/28 16:38
 */
public class Test2 {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (k <= 0) {
            return null;
        }
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k - 1 > 0) {
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
