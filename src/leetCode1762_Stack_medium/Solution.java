package leetCode1762_Stack_medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Solution {
    public int[] findBuildings(int[] heights) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < heights.length - 1; i++) {
            if (i == heights.length - 1){
                stack.push(i);
                continue;
            }

            for (int j = i; j < heights.length; j++) {
                if (heights[i] - heights[i+1]>0){
                    stack.push(i);
                }
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }

}
