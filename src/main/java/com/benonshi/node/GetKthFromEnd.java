package com.benonshi.node;
import com.benonshi.model.ListNode;

/**
 * 倒数第K个元素
 *
 * @author BenOniShi
 * @date 2020/11/30 20:02
 */
public class GetKthFromEnd {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || head.next == null) {
            return null;
        }
        // 定义双执政
        ListNode q = head;
        ListNode p = head;
        // 先让p 走 k 个元素
        while (k-- > 0) {
            p = p.next;
        }
        //同时走 即为倒数的元素
        while (p != null && p.next != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));
        ListNode kthFromEnd = getKthFromEnd(listNode, 1);
        System.out.println(kthFromEnd);
    }
}
