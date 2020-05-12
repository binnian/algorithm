package com.benonshi.node;

import com.benonshi.model.ListNode;


/**
 * 删除链表中等于给定值 val 的所有节点。
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-linked-list-elements/
 *
 * @Author: BenOnSHI
 * @Date: 2020/4/17 11:12
 **/
public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(val - 1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while (dummyNode.next != null) {
            if (dummyNode.next.val == val) {
                dummyNode.next = dummyNode.next.next;
            } else {
                dummyNode = dummyNode.next;
            }
        }
        return prev.next;
    }

    public static ListNode recursionRemoveElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = recursionRemoveElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(4, null))))));
        System.out.println("recursionRemoveElements(listNode, 1) = " + recursionRemoveElements(listNode, 4));

    }
}
