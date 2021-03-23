package com.benonshi.node;

import com.benonshi.model.ListNode;



/**
 * 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * @Author: BenOnSHI
 * @Date: 2021/2/21 17:26
 **/
public class SwapPairs {


    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;
        return node;
    }

    public static ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 虚拟节点
        ListNode node = new ListNode(0, head);
        ListNode p1 = node;
        ListNode p2;
        while (p1.next != null && p1.next.next != null) {
            // p2指向当前头节点
            p2 = p1.next;
            // 头节点指向 头节点的下一个节点
            p1.next = p2.next;
            // 头节点的下一个节点变为头节点
            p2.next = p2.next.next;
            // 前驱节点指向头节点的下一个节点
            p1.next.next = p2;
            // 更新p1
            p1 = p2;
        }
        return node.next;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode node = swapPairs2(listNode);
        ListNode.printNode(node);

    }
}
