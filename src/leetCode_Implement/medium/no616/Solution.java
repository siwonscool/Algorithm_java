package leetCode_Implement.medium.no616;

import java.util.*;

public class Solution {

    //문자열 s를 words 로 마킹 !!
    //내가직접 마킹을 해본다고 생각해보자 !!
    //XML parser
    //내가 기존에 썻던것은 merge interval
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

        return result+"";

    }
}
