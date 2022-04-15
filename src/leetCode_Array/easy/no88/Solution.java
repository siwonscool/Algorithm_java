package leetCode_Array.easy.no88;

import java.util.Arrays;

class Solution {

    //(M+N)log(M+N)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, k = 0; i < m+n; i++, k++) {
            nums1[i] = nums2[k];
        }

        Arrays.sort(nums1);
    }
}
