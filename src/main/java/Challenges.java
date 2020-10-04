package src.main.java;

public class Challenges {
//    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//    Return the running sum of nums.
    public int[] runningSum(int[] nums) {
        nums[0]=0+nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }

//    1512. Number of Good Pairs
//    Given an array of integers nums.
//    A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//    Return the number of good pairs.
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                    count++;
                }

            }
        }
        return count;
    }
}
