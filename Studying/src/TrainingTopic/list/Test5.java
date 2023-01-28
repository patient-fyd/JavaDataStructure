package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * @DateTime: 2023/1/28 16:49
 */
public class Test5 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
}
