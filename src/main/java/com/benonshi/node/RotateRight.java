package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * 来源: leetcode
 * 链接: https://leetcode-cn.com/problems/rotate-list/
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/10 11:52
 **/
public class RotateRight {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        // 保存一下当前节点
        ListNode per = head;
        // 虚拟头节点
        ListNode node = new ListNode(0);
        node.next = head;
        // 计算链表长度
        int n = 1;
        while (per.next != null) {
            per = per.next;
            n++;
        }
        k = k % n;
        while (k-- > 0) {
            // 如果下一个节点不为空
            while (true) {
                // head 指向 下一个节点
                per = head;
                head = head.next;
                // 如果下一个节点为空
                if (head.next == null) {
                    // 将下一个节点为 null的当前节点的next 指向头节点
                    head.next = node.next;
                    // 保存一下当前头节点
                    node.next = head;
                    // 将上一个节点的下一个节点指向为 null
                    per.next = null;
                    // 跳出循环
                    break;
                }
            }
        }
        return node.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode node = rotateRight(listNode, 2);
        ListNode.printNode(node);
    }
}
