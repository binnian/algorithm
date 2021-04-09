package com.benonshi.node;

import com.benonshi.model.ListNode;


/**
 * 给你单链表的头指针 head 和两个整数left 和 right ，其中left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 *
 * @Author: BenOnSHI
 * @Date: 2021/3/20 14:57
 **/
public class ReverseBetween {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = new ListNode(0);
        node.next = head;
        //建立伪节点
        ListNode pre = node;
        // 获取 链表left位置地前驱节点
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }
        // 先获当前前驱节点地下一个节点  head 作为 当前要反转的节点
        // head  -> 2
        head = pre.next;
        // 从链表的 left位置开始反转   right 位置结束
        for (int i = left; i < right; i++) {
            // 获取 head的下一个节点   next -> 3
            ListNode next = head.next;
            // 将 head 的next 指向  下一个节点的next    3 的next 指向4    将  2的next 指向  4
            head.next = next.next;
            // 将 next 的指向  更改为 当前head
            next.next = pre.next;
            // 将 头节点的next 指向 next  完成调换
            pre.next = next;
        }
        // 返回 头节点的下一个节点
        return node.next;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5, null)))));
        ListNode node1 = reverseBetween(node, 2, 4);
        ListNode.printNode(node1);
    }
}
