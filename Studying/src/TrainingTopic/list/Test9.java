package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给你一个链表的头节点 head ，判断链表中是否有环。
 * @DateTime: 2023/1/31 23:28
 */
public class Test9 {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
