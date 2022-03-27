package leetCode_Queue_medium.no362;

import java.util.Deque;
import java.util.LinkedList;

class HitCounter {
    Deque<Integer> queue;

    public HitCounter() {
        queue = new LinkedList<>();
    }

    //O(1)
    public void hit(int timestamp) {
        queue.add(timestamp);
    }

    //O(N)
    public int getHits(int timestamp) {
        while (!queue.isEmpty()&&queue.peekFirst() <= timestamp - 300){
            queue.pollFirst();
        }

        return queue.size();
    }

//    int[] time = new int[300];
//    int[] count = new int[300];
//
//    public HitCounter() {
//
//    }
//
//    //O(1)
//    public void hit(int timestamp) {
//        int idx = timestamp % 300;
//        if(time[idx] != timestamp){
//            time[idx] = timestamp;
//            count[idx]=1;
//        }else{
//            count[idx]++;
//        }
//    }
//
//    //O(N)
//    public int getHits(int timestamp) {
//        int cnt = 0;
//
//        for(int i =0; i < 300;i++){
//            if(timestamp - time[i] < 300){
//                cnt+=count[i];
//            }
//        }
//
//        return cnt;
//    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
