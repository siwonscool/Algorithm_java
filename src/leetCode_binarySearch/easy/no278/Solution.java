package leetCode_binarySearch.easy.no278;


/*
* 이진탐색 풀이중 고려해야할 탬플릿 3개
* 1. Min
* 2. Max
* 3. condition
* */
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