package Codility;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int maxValue = Integer.MIN_VALUE;
        int [] result = new int[N];

        for(int value : A){
            if(1 <= value && value <= N){
                int assignValue = result[value - 1] + 1;
                result[value - 1] = assignValue;
                if(assignValue > maxValue){
                    maxValue = assignValue;
                }
            }else if(value == N + 1){
                for(int i = 0; i < result.length; i++){
                    result[i] = maxValue;
                }
            }
        }

        return result;
    }
}
