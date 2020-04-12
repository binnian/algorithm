package com.benonshi.sort;

/**
 * 选择排序
 * 思想 : 从头至尾扫描序列，找出最小的一个元素，和第一个元素交换，接着从剩下的元素中继续这种选择和交换方式，最终得到一个有序序列。
 *
 * @author BenOniShi
 * @date 2020/3/8 0:29
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 1, 7, 3, 8, 15, 11, 2};
        //外层循环从 arr [ 0 ] 开始
        for (int i = 0; i < arr.length - 1; i++) {
            // 选择第一个数的位置
            int min = i;
            //内层循环从 i + 1 的位置开始
            for (int j = i + 1; j < arr.length; j++) {
                /*
                 *  用 arr[j] 位置的数 去和 arr[min]位置 比较
                 *  如果 arr[j] 小于 arr[min]
                 *  将 arr[j]的位置 赋值给min
                 */
                min = arr[j] < arr[min] ? j : min;
            }
            // if min 位置 发生了变化   交换位置  将 min位置的数挪到 i 的位置
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
