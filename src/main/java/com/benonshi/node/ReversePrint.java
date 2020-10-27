package com.benonshi.node;
import com.benonshi.model.ListNode;
import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * @author BenOniShi
 * @date 2020/10/27 23:59
 */
public class ReversePrint {
    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int[] nums = new int[stack.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = stack.pop().val;
        }
        return nums;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        int[] ints = reversePrint(listNode);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
