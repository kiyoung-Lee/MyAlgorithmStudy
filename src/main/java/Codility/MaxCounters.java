package Codility;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int maxValue = 0;
        int currentMaxValue = 0;
        int [] result = new int[N];

        for(int value : A){
            if(1 <= value && value <= N){
                if(value >= currentMaxValue){
                    int assignValue = result[value - 1] + 1;
                    result[value - 1] = assignValue;
                    maxValue = assignValue;
                }else if(value < currentMaxValue){
                    result[value - 1] = currentMaxValue + 1;
                    maxValue = currentMaxValue + 1;
                }
            }else if(value == N + 1){
                currentMaxValue = maxValue;
            }
        }

        for(int i = 0; i < N; i++){
            if(result[i] < currentMaxValue){
                result[i] = currentMaxValue;
            }
        }

        return result;
    }
}
