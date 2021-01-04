package com.benonshi.node;

import com.benonshi.model.ListNode;


/**
 * @Author: BenOnSHI
 * @Date: 2020/12/23 16:38
 **/
public class DeleteKthNode {

    public static ListNode deleteKthNode(ListNode head, int n) {
        ListNode per = new ListNode(0);
        per.next = head;
        ListNode q = per, p = per;
        while (n != 0) {
            q = q.next;
            n--;
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return per.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, null));
        ListNode listNode1 = deleteKthNode(listNode, 2);
        ListNode.printNode(listNode1);
    }
}
