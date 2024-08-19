package LeetCodeProblems;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int ele = target-nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]==ele)
                {
                    return new int[]{i,j};
                }
            }

        }
return new int[]{-1};
    }

    public static void main(String[] args) {
        int []nums ={2,9,7,11};
        int target =9;
        System.out.println(Arrays.toString(TwoSum.twoSum(nums,target)));
    }
}
