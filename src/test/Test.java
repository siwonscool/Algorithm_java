package test;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int N = 1041;
        int result = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();

        while(N > 0){
            list.add(N%2);
            N /= 2;
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)==1){
                count = i - count;

            }
        }
    }

}
