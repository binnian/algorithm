package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * @Author: BenOnSHI
 * @Date: 2021/3/21 17:40
 **/
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 题意 将链表的每个位置值相加之后反转    首位相加之后其实等于 数字的个位
        // 先建立一个虚拟头节点  链表基本操作
        ListNode dump = new ListNode(-1);
        // 建立一个result 链表
        ListNode res = dump;
        // 开始对链表l1和l2进行操作 肯定要进行无限循环  while开干
        // l1 和 l2 有一个不为null  就可以进入循环
        // 设立每次累加要 % 操作的值
        int temp = 0;
        while (l1 != null || l2 != null || temp != 0) {
            //   求l1.val + l2.val
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + temp;
            //这里  sum%10 求余数
            res.next = new ListNode(sum % 10);
            // 将 res 的指向指向 next
            res = res.next;
            //这里将 计算下一次要进位的值
            temp = sum / 10;
            //先改变指针的指向
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        // 返回头节点
        return dump.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode node = addTwoNumbers(node1, node2);
        ListNode.printNode(node);
    }

}
