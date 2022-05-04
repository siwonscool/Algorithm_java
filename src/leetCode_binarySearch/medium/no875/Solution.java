package leetCode_binarySearch.medium.no875;

class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int minPile = 1;
        int maxPile = 1000000000;

        while (minPile <= maxPile) {
            int midPile = minPile + (maxPile - minPile) / 2;
            int totalHour = 0;
            for (int pile : piles) {
                totalHour += pile / midPile + (pile % midPile != 0 ? 1 : 0);
            }

            if (totalHour <= h) {
                maxPile = midPile - 1;
            } else {
                minPile = midPile + 1;
            }
        }

        return minPile;
    }
}