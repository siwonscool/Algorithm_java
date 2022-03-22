package leetCode_Queue_easy.no2083;

class Solution {

    //O(N)
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k){
                if (tickets[i] < tickets[k]){
                    count += tickets[i];
                }else {
                    count += tickets[k];
                }
            }else {
                if (tickets[i] < tickets[k]){
                    count += tickets[i];
                }else {
                    count += tickets[k] - 1;
                }
            }
        }

        return count;
    }
}
