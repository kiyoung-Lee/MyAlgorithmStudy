package Codility;

public class TapeEquilibrium {

    public int solution(int[] A) {
        // write your code in Java SE 8

        int arraySize = A.length;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < arraySize; i++){
            int p = i + 1;
            if(p < arraySize){

                int frontSum = 0;
                int backSum = 0;

                for(int q = 0; q < p; q++){
                    frontSum += A[q];
                }

                for(int t = p; t < arraySize; t++){
                    backSum += A[t];
                }

                int result = Math.abs(frontSum - backSum);
                if(minSum > result){
                    minSum = result;
                }
            }
        }

        return minSum;
    }
}
