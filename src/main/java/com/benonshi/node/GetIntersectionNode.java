package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * @Author: BenOnSHI
 * @Date: 2020/10/31 11:37
 **/
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        // 分别指向 A 和  B 的头节点
        ListNode lena = headA,lenb = headB;
        while (lena != lenb) {
            // 如果 a走完 指向null  则将a 指向 B头节点 否则 指向下一个节点
            lena = lena == null ? headB : lena.next;
            // 如果 b走完 指向null  则将b 指向 A头节点 否则 指向下一个节点
            lenb = lenb == null ? headA : lenb.next;
            // 如 A [1,2,5,6,8]   B [3,5,6,8]   指针b 将先走完  将b -> 1  此时 a -> 8
            // next
            // b -> 2
            // a -> 3
            // a b  ->  5
        }
        return lena;
    }
}
