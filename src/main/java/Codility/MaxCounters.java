package Codility;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int condition = N + 1;
        int currentMaxValue = 0;
        int lastUpdate = 0;
        int [] result = new int[N];

        for(int i = 0; i < A.length; i++){
            if(A[i] == condition){
                lastUpdate = currentMaxValue;
            }else{
                int position = A[i] - 1;
                int value = result[position];
                if(value < lastUpdate){
                    result[position] = lastUpdate + 1;
                }else
                    result[position]++;

                if(result[position] > currentMaxValue)
                    currentMaxValue = result[position];
            }
        }

        for(int q = 0; q < result.length; q++){
            if(result[q] < lastUpdate){
                result[q] = lastUpdate;
            }
        }

        return result;
    }
}
