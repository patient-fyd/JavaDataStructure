package TrainingTopic;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 反转链表
 * @DateTime: 2023/1/28 16:47
 */
public class Test4 {
    /**
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
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
}
