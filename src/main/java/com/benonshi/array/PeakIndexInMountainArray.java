package com.benonshi.array;

/**
 * 852. 山脉数组的峰顶索引
 * 符合下列属性的数组 arr 称为 山脉数组
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author BenOniShi
 * @date 2021/6/28 22:42
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //满足条件
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //右边比左边高   山峰在右边
            if (arr[mid + 1] > arr[mid]) {
                left = mid;
            }
            // 右边比左边低  山峰在左边
            if (arr[mid + 1] < arr[mid]) {
                right = mid;
            }
        }
        return -1;
    }
}