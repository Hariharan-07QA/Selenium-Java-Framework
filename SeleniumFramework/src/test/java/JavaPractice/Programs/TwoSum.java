package JavaPractice.Programs;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                int complement = target - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == complement)
                        k = j;
                    break;
                }
                int []a=new int[]{i, k};
                System.out.println(Arrays.toString(a));
                return a;

            }
        }
        int []b=new int[]{-1};
        System.out.println(Arrays.toString(b));

        return b;
    }



        public static void main(String[] args) {
      int [] nums={2,8,7,15};
      int target =9;
        System.out.println(TwoSum.twoSum(nums,target));
    }
}
