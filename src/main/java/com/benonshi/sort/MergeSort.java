package com.benonshi.sort;


import java.util.Random;

/**
 * @author BenOniShi
 * @date 2020/5/11 23:25
 */
public class MergeSort {


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
        System.out.println(l1 - l);

//
//        sort(arr, 0, arr.length - 1);
//        SortUtils.print(arr);


    }

    public static void sort(int[] arr, int left, int right) {
        if (right == left) return;
        // 取中间数
        int mid = left + (right - left) / 2;
        // 左边排序
        sort(arr, left, mid);
        // 右边排序
        sort(arr, mid + 1, right);
        // 合并
        merge(arr, left, mid + 1, right);

    }

    public static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while (i <= mid && j <= rightBound) temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= rightBound) temp[k++] = arr[j++];

        for (int l = 0; l < temp.length; l++) arr[leftPtr + l] = temp[l];

    }
}
