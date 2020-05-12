package com.benonshi.model;

/**
 * @author BenOniShi
 * @date 2020/4/13 1:09
 */
public class ListNode {
    public int val;
    public ListNode next;

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
