package com.benonshi.sort;

/**
 * 插入排序
 * 每趟将一个元素，按照其关键字的大小插入到它前面已经排序的子序列中，依此重复，直到插入全部元素。
 * @author BenOniShi
 * @date 2020/3/8 23:46
 */
public class InsertionSort {

    public static void main(String[] args) {

        /**
         * 直接插入排序的思想：当插入第i(i>=1)个元素时，前面的arr[0],…,arr[i-1]等i-1个 元素已经有序。
         * 这时，将第i个元素与前i-1个元素arr[i-1]，…，arr[0]依次比较，找到插入位置即将arr[i]插入。
         * 插入位置的查找是顺序查找,从已经排好序列的最后一个数开始向前遍历，如果插入数小于当前数，就将当前数向后移动一位。
         */
        int[] arr = {9, 6, 4, 1, 7, 3, 8, 11, 10};
        //外层循环 从第一个位置开始
        for (int i = 1; i < arr.length; i++) {
            //内层循环 j 从 i 开始 到 0 结束
            for (int j = i; j > 0; j--) {
                // if  i 位置的数 小于 j -1 位置的数  交换位置
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
