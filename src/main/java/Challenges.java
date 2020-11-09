package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Challenges {
    public static void main(String[] args) {

    }
//    1021.

    //    A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
//    A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
//    Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
//    Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
    public String removeOuterParentheses(String S) {
        int count = 0;

        StringBuilder sb = new StringBuilder();
        StringBuilder res =  new StringBuilder();

        for(char ch: S.toCharArray()){
            sb.append(ch);
            count+=ch=='(' ? 1:-1;
            if(count ==0){
                res.append(sb.substring(1,sb.length()-1));
                sb=new StringBuilder();
            }
        }
        return res.toString();
    }

    //1572. Matrix Diagonal Sum
//    Given a square matrix mat, return the sum of the matrix diagonals.
//    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[n - 1 - i][i];
        }
        return n % 2 == 0 ? sum : sum - mat[n / 2][n / 2];
    }

    //    1266. Minimum Time Visiting All Points
//    On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.
//    You can move according to the next rules:
//    In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
//    You have to visit the points in the same order as they appear in the array.
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 1; i < points.length; i++) {
            int x = Math.abs(points[i][0] - points[i - 1][0]);
            int y = Math.abs(points[i][1] - points[i - 1][1]);
            if (x >= y) count += x;
            else count += y;
        }
        return count;
    }

//    1534. Count Good Triplets
//    Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.
//            A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
//            0 <= i < j < k < arr.length
//|arr[i] - arr[j]| <= a
//|arr[j] - arr[k]| <= b
//|arr[i] - arr[k]| <= c
//    Where |x| denotes the absolute value of x.
//    Return the number of good triplets.

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) > a) continue;
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[j] - arr[k]) > b) continue;
                    count += (Math.abs(arr[i] - arr[k]) > c) ? 0 : 1;
                }
            }
        }
        return count;
    }

    //    1486. XOR Operation in an Array
//    Given an integer n and an integer start.
//    Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
//    Return the bitwise XOR of all elements of nums.
    public int xorOperation(int n, int start) {
        int[] newArray = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            newArray[i] = start;
            sum ^= newArray[i];
            start += 2;
        }
        return sum;


    }

    //    1528. Shuffle String
//    Given a string s and an integer array indices of the same length.
//    The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//    Return the shuffled string.
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        char[] sToChars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = sToChars[i];
        }
        return new String(result);
    }


//    771. Jewels and Stones
//    You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//    The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char i : S.toCharArray()) {
            if (J.indexOf(i) != -1) {
                count++;
            }
        }
        return count;

    }

//    1431. Kids With the Greatest Number of Candies
//    Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
//    For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them.
//    Notice that multiple kids can have the greatest number of candies.

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> candiesList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            if (i > max)
                max = i;
            // if(int current(i)+extraCandies>)
        }
        for (int i : candies) {
            if ((i + extraCandies) >= max) {
                candiesList.add(true);
            } else {
                candiesList.add(false);
            }
        }
        return candiesList;
    }

    //    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//    Return the running sum of nums.
    public int[] runningSum(int[] nums) {
        nums[0] = 0 + nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    //    1512. Number of Good Pairs
//    Given an array of integers nums.
//    A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//    Return the number of good pairs.
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }

            }
        }
        return count;
    }
}
