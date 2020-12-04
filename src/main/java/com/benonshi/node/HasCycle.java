package com.benonshi.node;
import com.benonshi.model.ListNode;

/**
 * 判断链表是否有环
 * @author BenOniShi
 * @date 2020/11/30 18:07
 */
public class HasCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        // 定义快 慢 指针
        ListNode fastNode = head.next;
        ListNode slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            // 快指针每次走两步
            fastNode = fastNode.next.next;
            // 慢指针每次走一步
            slowNode = slowNode.next;
            if (fastNode == slowNode) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, listNode5))));
        listNode5.next = listNode;
        boolean b = hasCycle(listNode);
        System.out.println(b);

    }
}
