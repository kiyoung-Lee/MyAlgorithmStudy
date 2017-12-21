package Codility;

// 1, 0
// 0, 1
// 1, 1
// 0, 0

public class CountDiv {

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8

        int result = B / K + 1;

        if(A != 0) {
            int rangeFlag = A / K;

            if (A % K != 0)
                rangeFlag++;

            result = result - rangeFlag;
        }

        return result;
    }
}
