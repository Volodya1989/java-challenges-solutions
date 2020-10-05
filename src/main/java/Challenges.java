package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Challenges {
    public static void main(String[] args) {

    }
//    1431. Kids With the Greatest Number of Candies
//    Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
//    For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them.
//    Notice that multiple kids can have the greatest number of candies.

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>candiesList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i:candies){
            if(i>max)
                max=i;
            // if(int current(i)+extraCandies>)
        }
        for(int i: candies){
            if((i+extraCandies)>=max){
                candiesList.add(true);
            }else{
                candiesList.add(false);
            }
        }
        return candiesList;
    }
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
