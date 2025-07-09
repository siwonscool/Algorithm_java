package leetCode_Array.no3;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastSeen = new int[128];

        int L = 0;
        for (int R = 0; R < n; R++) {
            char current = s.charAt(R);
            L = Math.max(L, lastSeen[current]);
            maxLength = Math.max(maxLength, R - L + 1);
            lastSeen[current] = R + 1;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }
}
