package src.main.java;

public class MaxSubarray {
//    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//    Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = nums[0];
        int max = sum;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > sum) {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }


}
