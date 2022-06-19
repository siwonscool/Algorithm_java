package test;

import java.util.*;
import java.lang.Math;

public class Codility1 {
    public int solution(int N) {
        int result = 0;
        String biN = Integer.toBinaryString(N);
        List<Integer> list = new ArrayList<>();

        for(int i =0 ;i<biN.length();i++){
            if(biN.charAt(i)=='0'){
                continue;
            }
            list.add(i);
        }

        for(int i =0; i < list.size()-1 ;i++){
            result = Math.max(list.get(i+1) - list.get(i) -1 , result);
        }

        return result;
    }
}
