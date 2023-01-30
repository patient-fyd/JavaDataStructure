package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
 * @DateTime: 2023/1/29 21:21
 */
public class Test6 {
    public boolean chkPalindrome(ListNode head) {

        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }

        // 1、找中间节点
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、 slow一定是中间节点
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、slow走到了最后一个节点的地方
        while(head != slow){
            if (head.val != slow.val){
                return false;
            }
            //偶数的情况
            if (head.next == slow){
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
