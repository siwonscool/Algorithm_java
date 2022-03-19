package leetCode1762_Stack_medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Solution {
    public int[] findBuildings(int[] heights) {
        boolean heightCheck = false;
        Deque<Integer> stack = new LinkedList<>();

        loop1 :for (int i = 0; i < heights.length; i++) {
            if (i == heights.length - 1){
                stack.add(i);
            }

            heightCheck = false;

            for (int j = i+1; j < heights.length; j++) {
                if(heights[i] <= heights[j]){
                    heightCheck = true;
                }
            }

            if (heightCheck == false){
                stack.add(i);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }

}
