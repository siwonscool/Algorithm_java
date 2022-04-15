package leetCode_Array.medium.no15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    //N^2
    public List<List<Integer>> threeSum(int[] nums) {
        //Nlog(N)
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        //N^2
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int lowerIndex = i + 1;
            int higherIndex = nums.length - 1;

            while (lowerIndex < higherIndex){
                int sum = nums[i] + nums[lowerIndex] + nums[higherIndex];

                if (sum > 0){
                    higherIndex--;
                }else if (sum < 0){
                    lowerIndex++;
                }else {
                    result.add(Arrays.asList(nums[i],nums[lowerIndex++],nums[higherIndex--]));
                    while (lowerIndex < higherIndex && nums[lowerIndex] == nums[lowerIndex-1]){
                        lowerIndex++;
                    }
                }
            }
        }

        return result;
    }
}
