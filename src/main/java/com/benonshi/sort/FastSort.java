package com.benonshi.sort;

import java.util.Random;

/**
 * 快速排序
 *
 * @author BenOniShi
 * @date 2020/5/14 20:34
 */
public class FastSort {


    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(10);
        int[] arr = new int[100000000];
        for (int j = 0; j < 100000000; j++) {
            arr[j] = random.nextInt(1000000 + 1);
        }
        // 调用排序方法 传 数组  开始  轴
        long l = System.currentTimeMillis();
        sort(arr, 0, arr.length - 1);
        long l1 = System.currentTimeMillis();
        System.out.println(Long.valueOf(l1 - l));
//        SortUtils.print(arr);

    }


    public static void sort(int[] arr, int left, int right) {
        // 如果 left >= right  开始 大于 轴  返回
        if (left >= right) return;
        // 调用方法
        int mid = partition(arr, left, right);
        sort(arr, left, mid - 1);
        sort(arr, mid + 1, right);

    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        // 确定轴得值
        int pivot = arr[rightBound];
        // 左边
        int left = leftBound;
        // 右边
        int right = rightBound - 1;
        // 如果 左边小于 右边
        while (left <= right) {
            // 如果左边 小于 右边   找 第一个小于等于轴的值得下标
            while (left <= right && arr[left] <= pivot) left++;
            // 如果左边界 小于 有边界  找从右边开始即轴位置-1 开始 大于轴的值的下标
            while (left <= right && arr[right] > pivot) right--;
            // 如果左边界 小于 右边界
            if (left < right) {
                // 交换位置
                SortUtils.swap(arr, left, right);
            }
        }
        // 将 轴与碰撞的地方交换位置  即 最后一个left的位置
        SortUtils.swap(arr, left, rightBound);
        // 返回一个left
        return left;
    }
}

