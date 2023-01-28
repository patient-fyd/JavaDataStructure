package TrainingTopic.list;

import TrainingTopic.list.ListNode;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 将两个升序链表合并为一个新的 升序 链表并返回
 * @DateTime: 2023/1/28 16:47
 */
public class Test4 {
    /**
     * @param head
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode();
        ListNode temp = newHead;

        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }
        return newHead.next;
    }
}
