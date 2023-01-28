package TrainingTopic;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 反转链表，返回一个新头节点
 * @DateTime: 2023/1/28 14:08
 */
public class Test1 extends ListNode {
    /**
     * @param head 头节点
     * @return 返回新的头节点
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
