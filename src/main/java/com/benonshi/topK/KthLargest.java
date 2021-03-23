package com.benonshi.topK;

import java.util.PriorityQueue;

/**
 * 数据流中的第 K 大元素
 * 设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 *
 * 请实现 KthLargest类：
 *
 * KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
 * int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
 * @Author: BenOnSHI
 * @Date: 2021/2/20 15:22
 **/
public class KthLargest {

    /**
     * 优先队列 PriorityQueue
     * k  k个元素
     */
    PriorityQueue<Integer> queue;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for (int num : nums) {
            System.out.println(add(num));
        }
    }

    public int add(int val) {
        // 添加值
        queue.offer(val);
        // 如果大于第k个元素
        while (queue.size()> k){
            // 移除
            queue.poll();
        }
        // 返回当前第k大元素
        return queue.peek();
    }


    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11});
    }
}
