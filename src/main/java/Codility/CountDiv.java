package Codility;

public class CountDiv {

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int result = 0;
        int gap = B - A;
        int divideValue = gap / K;

        if(A != B) {
            if(A != 0 && B != 0 && A % K == 0 && B % K ==0){
                result++;
            }else {
                if (A != 0 && A % K == 0)
                    result++;
                if (B != 0 && B % K == 0)
                    result++;
            }
        }else{
            if(A % K == 0) {
                result++;
            }
        }

        result = result + divideValue;

        return result;
    }
}
