package com.benonshi;

/**
 * 选择排序
 * 给定一个数组  从大到小排序
 *
 * @author BenOniShi
 * @date 2020/3/8 0:29
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 1, 7, 3, 8,15,11};
        for (int i = 0; i < arr.length - 1; i++) {
            //定义数组
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
              min= arr[j] <arr[min] ? j :min;
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
}
