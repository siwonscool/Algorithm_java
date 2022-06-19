package test;

public class Codility21 {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        for(int i =0; i<A.length; i++){
            int shiftIndex = (i + K) % A.length;
            result[shiftIndex] = A[i];
        }

        return result;
    }
}
