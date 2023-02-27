package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * @DateTime: 2023/2/27 13:04
 */
public class Test11 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
