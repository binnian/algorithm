package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 删除 排序链表中的重复元素
 *
 * @Author: BenOnSHI
 * @Date: 2020/4/13 14:55
 **/
public class DeleteDuplicates {

    public ListNode delDuplicates(ListNode head) {
        //先保存头节点
        ListNode listNode = head;
        // 如果head不为null 并且 head的next 不为null
        while (head != null && head.next != null) {
            // head 的next 的值 等于 head 的 val
            if (head.next.val == head.val) {
                // 将 head 的 next  指向  head 的next 的next
                head.next = head.next.next;
            }
            // 将 head 指向 它的 next
            head = head.next;
        }
        //返回头节点
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(4, null))))));
        System.out.println("listNode = " + new DeleteDuplicates().delDuplicates(listNode));
    }


}
