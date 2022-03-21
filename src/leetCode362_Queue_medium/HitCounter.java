package leetCode362_Queue_medium;

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
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
