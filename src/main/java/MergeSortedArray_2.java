package src.main.java;

import java.util.Arrays;

public class MergeSortedArray_2 {


//    Easy, but not the best way to solve it
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m,n);
        Arrays.sort(nums1);
    }
}
