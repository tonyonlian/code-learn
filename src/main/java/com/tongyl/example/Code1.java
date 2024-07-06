package com.tongyl.example;

import java.util.Arrays;

/**
 * Remove Duplicates From Sorted Array
 *
 * Give a sorted array, the duplicates in place such that each element appear only once and return the new length
 * Do not allocate extra space for another array ,you must do this in place with constant memory.
 * For example, Give input array A = [1,1,2]
 * Your function should return length = 2 and A is now [1,2]
 *
 */
public class Code1 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 2, 3, 3, 6, 6, 9}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }


}
