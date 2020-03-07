package org.example;

/**
 * 选择排序
 * 给定一个数组  从大到小排序
 * @author BenOniShi
 * @date 2020/3/8 0:29
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 1, 7, 3, 8};
        for (int i =0;i<arr.length-1;i++){
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=  arr[min] ;
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
