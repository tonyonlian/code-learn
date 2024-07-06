package com.tongyl.example;

/**
 * Remove Duplicates From Sorted Array
 * <p>
 * Follow up for "Remove Duplicates": What if duplicates are allowed at most twice
 * For example,give sorted array A = [1,1,1,2,2,3], your function should return length = 5,And A is now [1,1,2,2,3]
 */

public class Code2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i] == nums[i - 1] && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[index++] = nums[i];
        }
        return index;
    }
}
