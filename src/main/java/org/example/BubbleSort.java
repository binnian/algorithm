package org.example;

/**
 * 冒泡排序
 * @author BenOniShi
 * @date 2020/3/8 16:40
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 1, 7, 3, 8};
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j<i;j++){
                if (arr[j] >arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0;i<arr.length-1;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[j] <arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
