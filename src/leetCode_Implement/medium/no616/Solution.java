package leetCode_Implement.medium.no616;

import java.util.*;

public class Solution {

    public String addBoldTag(String s, String[] words) {
        Deque<Integer> queue = new LinkedList<>();

        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            for (String word : words){
                if (s.startsWith(word,i)){
                    if (queue.isEmpty()){
                        queue.add(i);
                    }else if (queue.peekLast() > i){
                        queue.pollFirst();
                    }else if (queue.peekLast() != i){
                        queue.add(i);
                    }

                    flag = Math.max(flag,i + word.length());
                }
            }

            if (queue.peekLast() != flag){
                queue.add(flag);
            }
        }

        queue.stream().forEach(System.out::println);

        StringBuffer result = new StringBuffer(s);

        int updateLength = 0;
        while(!queue.isEmpty()){
            result.insert(queue.pollFirst()+updateLength, "<b>");
            updateLength += 3;
            result.insert(queue.pollFirst()+updateLength, "</b>");
            updateLength += 4;
        }

        return result.toString();

    }
}
