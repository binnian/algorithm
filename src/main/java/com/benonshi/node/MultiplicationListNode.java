package com.benonshi.node;

import com.benonshi.model.ListNode;


/**
 * 两链表相乘
 * @Author: BenOnSHI
 * @Date: 2021/2/27 15:50
 **/
public class MultiplicationListNode {

    public static float multiplicationListNode(ListNode p1, ListNode p2) {
        return sumListNode(p1) * sumListNode(p2);
    }

    public static int sumListNode(ListNode node) {
        int x = 0;
        while (node != null) {
            x *= 10;
            x += node.val;
            node = node.next;
        }
        return x;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2,
                new ListNode(3,null)));
        ListNode listNode1 = new ListNode(1, new ListNode(2,
                new ListNode(3,null)));
        float v = multiplicationListNode(listNode1, listNode);
        System.out.println(v);
    }


}
