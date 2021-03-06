package test;

public class Codility22 {
    public int solution(int[] A) {
        if(A.length==0){
            return 0;
        }

        int result = 0;
        result = A[0];

        for(int i=1;i<A.length;i++){
            result = result ^ A[i];
        }

        return result;
    }
}
