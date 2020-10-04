package src.main.java;

public class Challenges {
    public int[] runningSum(int[] nums) {
        nums[0]=0+nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
