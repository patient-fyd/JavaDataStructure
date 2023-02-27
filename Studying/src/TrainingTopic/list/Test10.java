package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * @DateTime: 2023/2/26 15:06
 */
public class Test10 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        //到这里后有两种情况。1、不满足循环条件【说明没有环】 2、遇到了break【说明有环】
        if (fast == null || fast.next == null){
            return null;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
