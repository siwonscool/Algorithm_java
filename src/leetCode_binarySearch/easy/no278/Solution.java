package leetCode_binarySearch.easy.no278;

public class Solution {

    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;

        while(first < last){
            int mid = first + (last-first)/2;
            if(true/*!isBadVersion(mid)*/) {
                first = mid + 1;
            }else{
                last = mid;
            }
        }

        return first;
    }
}
