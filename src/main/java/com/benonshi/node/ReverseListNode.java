package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 反转链表
 * @author BenOniShi
 * @date 2020/4/13 0:50
 */
public class ReverseListNode {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next ==null){
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        System.out.println("ReverseListNode.reverseList(listNode) = " + ReverseListNode.reverseList(listNode));
    }

}

