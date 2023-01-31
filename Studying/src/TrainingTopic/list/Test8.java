package TrainingTopic.list;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * @DateTime: 2023/1/31 22:38
 */
public class Test8 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /**
         定义两个指针, 第一轮让两个到达末尾的节点指向另一个链表的头部, 最后如果相遇则为交点(在第一轮移动中恰好抹除了长度差)
         两个指针等于移动了相同的距离, 有交点就返回, 无交点就是各走了两条指针的长度
         **/
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA, pB = headB;
        // 在这里第一轮体现在pA和pB第一次到达尾部会移向另一链表的表头, 而第二轮体现在如果pA或pB相交就返回交点, 不相交最后就是null==null
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
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
