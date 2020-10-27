package com.benonshi.node;

import com.benonshi.model.ListNode;

/**
 * 反转链表
 * @author BenOniShi
 * @date 2020/4/13 0:50
 */
public class ReverseListNode {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next ==null){
            return head;
        }
        /**
         * reverseList(head.next) 此时最后一层结束递归的条件是head.next == null , head 等于 4 ， 那么它的上一层就是 reverseList(3.next) ， head 等于3 ， 因此后面
         * head.next.next = head  相当于 3的后面(4)的后面指向3 ， 那就是 3<-4
         * 然后 head.next = null , 最后renturn node ， 倒数第二层往上返回了 null <- 3 <-4 。
         * 最顶层通过递归条件 head == null 整体结束
         */
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        System.out.println("ReverseListNode.reverseList(listNode) = " + ReverseListNode.reverseList(listNode));
    }

}

