package leetCode1762_Stack_medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

class Solution {
    public int[] findBuildings(int[] heights) {
        //값이 0 인덱스 부터 들어온다고 했을때 왼쪽에 있는 친구들이 나보다 작으면 stack에서 빼줌
        Deque<Integer> stack = new LinkedList<>();

        for(int i = 0; i < heights.length ; i++){
            while(!stack.isEmpty()&&heights[stack.peekLast()] <= heights[i]){
                stack.pollLast();
            }
            stack.add(i);
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
