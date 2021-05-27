package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 23. 合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 *
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * @Author: BenOnSHI
 * @Date: 2021/5/27 14:39
 **/
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeNodeList(lists, 0, lists.length - 1);
    }

    public ListNode mergeNodeList(ListNode[] lists, int i, int j) {
        if (i == j) {
            return lists[i];
        }
        int mid = i + (j - i) / 2;
        ListNode l1 = mergeNodeList(lists, i, mid);
        ListNode l2 = mergeNodeList(lists, mid + 1, j);
        return merge(l1, l2);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}