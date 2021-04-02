package com.benonshi.node;

import com.benonshi.model.ListNode;


/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle-ii
 *
 * @author BenOniShi
 * @date 2021/3/23 17:01
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        //解题思路  首先判断链表是否有环  链表是否有环用双指针  常规套路
        if (head == null) {
            return head;
        }
        //首先定义快慢指针
        ListNode fast = head;
        ListNode slow = head;
        //开始判断  快指针每次走两步  慢指针每次走一步  和两个人赛跑一样  如果链表有环
        //快指针  追慢指针 快指针必然能追上
        //设置一个 Boolean 变量 判断
        boolean hasCycle = false;
        // 条件  fast 或者  fast的next 等于 null 即链表无环退出
        while (fast != null && fast.next != null) {
            //fast -> fast.next.next   slow -> slow.next
            fast = fast.next.next; // 每次走两步
            slow = slow.next;      // 每次走一步
            //判断  如果fast追上 slow 则有环 退出循环
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        // 思考 解题第二步 返回链表开始入环的第一个节点 现在已知链表是否有环
        // 现在已知 slow 指针和 fast 指针相遇
        // 1 > 2 > 3 > 4 > 5 > 6 >  指向了2的位置  链表  尾节点 6 指向了 2的位置
        /*
            slow 1 > 2 > 3 > 4 > 5 > 6 > 2 > 3 > 4 > 5 > 6
            fast 1 > 3 > 5 > 2 > 4 > 6 > 3 > 5 > 2 > 4 > 6
                    fast slow 相遇在6 的位置 说明链表存在环
                    现在  slow 走了  开始位置 - 环入口 （x）    环入口 - 相遇 (y)
                         fast走了  b距离   开始位置 - 环入口(x)    两次 环入口 - 相遇(y)  相遇 - 走完环 （z）
                         slow = x+ y    fast = x + 2y + z
                         fast 走了两倍的 slow的距离 得   2(x+y) = x + 2y + z  即 x = z
                         所以slow 走完环得距离 = head 到入口的距离
         */
        if (hasCycle) {
            //定义一个 p 节点  p节点 为1
            ListNode p = head;
            // 现在链表是有环的状态
            while (p != slow) {
                // p的下一个指向了  2
                p = p.next;
                // slow 现在是6   指向下一个 进入环的第一个   为2
                slow = slow.next;
            }
            // p就是链表入环的位置
            return p;
        } else {
            return null;
        }
    }
}
