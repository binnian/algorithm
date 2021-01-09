package com.benonshi.node;
import com.benonshi.model.ListNode;

/**
 * 删除 排序链表中的重复元素,只保留不重复的元素
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/9 13:46
 **/
public class DeleteDuplicatesII {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = new ListNode(head.val - 1);
        listNode.next = head;
        ListNode p = listNode;
        ListNode per = listNode;

        while (listNode.next != null) {
            // 如果 当前节点 与  下一个节点相同
            if (listNode.val == listNode.next.val) {
                // 找到 链表中第一个不同的节点
                ListNode node = find(listNode);
                if (node != null) {
                    // 替换当前节点为下一个不重复的节点
                    listNode.val = node.val;
                    listNode.next = node.next;
                } else {
                    // 断开 前一个节点的连接  断开当前节点的连接
                    System.out.println(per.next);
                    System.out.println(listNode);
                    per.next = null;
                    listNode.next = null;
                }
            } else {
                // 保存当前节点信息
                per = listNode;
                // 将当前节点指向下一个节点
                listNode = listNode.next;
            }
        }
        return p.next;
    }

    private static ListNode find(ListNode listNode) {
        ListNode p = listNode;
        while (listNode.next != null) {
            if (p.val == listNode.next.val) {
                listNode = listNode.next;
            } else {
                break;
            }
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5, null)))))));
        ListNode listNode2 = new ListNode(1, new ListNode(1, null));
        ListNode listNode1 = deleteDuplicates(listNode2);
        ListNode.printNode(listNode1);
    }
}
