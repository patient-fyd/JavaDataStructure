package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 现有一链表的头指针 ListNode* pHead，给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
 * @DateTime: 2023/1/31 22:18
 */
public class Test7 {
    public ListNode partition(ListNode head,int x) {

        if (head == null){
            return null;
        }

        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;

        ListNode cur = head;
        while(cur != null) {
            if (cur.val <x) {
                //判断是不是第一次插入
                if (bs == null){
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (as == null){
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }

        if (bs == null){
            //说明第一个区间没有数据
            return as;
        }
        be.next = as;
        if (as != null){
            ae.next = null;
        }
        return bs;
    }
}
