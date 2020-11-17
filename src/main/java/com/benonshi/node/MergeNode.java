package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 合并两个链表
 * @author BenOniShi
 * @date 2020/10/27 22:01
 */
public class MergeNode {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        // 如果 l1.val < l2.val  保留l1 将 l1的下一个数与 l2比较  否则  取反
        if (l1.val < l2.val) {
            // 将l1的next 作为 新的 l1 传入 函数
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            // 将l2的next 作为 新的 l2 传入 函数
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(4, null))))));
        ListNode listNode2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(4, null))))));
        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        ListNode.printNode(listNode);
    }
}
