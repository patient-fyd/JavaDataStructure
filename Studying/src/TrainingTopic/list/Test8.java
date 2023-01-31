package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * @DateTime: 2023/1/31 22:38
 */
public class Test8 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }

        //1、求两个链表的长度
        int lenA = 0;
        int lenB = 0;
        //pl：永远指向长的链表
        ListNode pl = headA;
        //ps：永远指向短的链表
        ListNode ps = headB;
        while(pl != null){
            lenA++;
            pl = pl.next;
        }
        while(ps != null){
            lenB++;
            ps = ps.next;
        }

        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0){
            //说明A比B短，要换一下
            pl = headB;
            ps = headA;
            len = lenB-lenA;
        }
        //长的先走差值步
        while(len != 0){
            pl = pl.next;
            len--;
        }
        while(pl != ps){
            pl = pl.next;
            ps = ps.next;
        }
        return pl;

    }
}
