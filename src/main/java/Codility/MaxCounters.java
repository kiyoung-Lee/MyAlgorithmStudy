package Codility;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int condition = N + 1;
        int currentMaxValue = 0;
        int [] result = new int[N];

        for(int i = 0; i < A.length; i++){
            if(A[i] == condition){
                Arrays.fill(result, currentMaxValue);
            }else{
                int position = A[i] - 1;
                int value = result[position] + 1;
                result[position] = value;

                if(value > currentMaxValue)
                    currentMaxValue = value;
            }
        }

        return result;
    }
}
