package Codility;

public class TapeEquilibrium {

    public int solution(int[] A) {
        // write your code in Java SE 8

        int arraySize = A.length;
        int left = A[0];
        int right = 0;
        int minSum = Integer.MAX_VALUE;

        for(int i = 1; i < arraySize; i++){
            right += A[i];
        }

        minSum = Math.abs(left - right);
        for(int q = 1 ; q < arraySize -1; q++){
            left += A[q];
            right -= A[q];

            int diff = Math.abs(left - right);
            if(minSum > diff){
                minSum = diff;
            }
        }

        return minSum;
    }
}
