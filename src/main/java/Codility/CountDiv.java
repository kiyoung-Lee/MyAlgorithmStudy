package Codility;

// 1, 0
// 0, 1
// 1, 1
// 0, 0

public class CountDiv {

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int result = 0;
//        int gap = B - A;
//        int divideValue = gap / K;
//
//        if(A != B) {
//            if(A != 0 && B != 0 && A % K == 0 && B % K ==0){
//                result++;
//            }else {
//                if (A != 0 && A % K == 0)
//                    result++;
//                if (B != 0 && B % K == 0)
//                    result++;
//            }
//        }else{
//            if(A % K == 0) {
//                result++;
//            }
//        }
//
//        result = result + divideValue;


        int A_Result;
        int A_Nam;
        int B_Result;
        int B_Nam;

        A_Result = A / K;
        A_Nam = A % K;
        B_Result = B / K;
        B_Nam = B % K;

        result = B_Result - A_Result;

        if(A == B){
            if(A % K == 1){
                return 0;
            }else if(A % K == 0){
                return 1;
            }else if(A == 0){
                return 1;
            }
        }

        if(A_Result != 0 && B_Result != 0){
            if(A_Nam == 1 && B_Nam != 1)
                result ++;
            if(A_Nam != 1 && B_Nam == 1)
                result ++;
            if(A_Nam == 0 && B_Nam == 0)
                result++;
        }


        return result;
    }
}
