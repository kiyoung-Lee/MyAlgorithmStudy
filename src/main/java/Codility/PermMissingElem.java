package Codility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class PermMissingElem {

    public int solution(int[] A) {
        // write your code in Java SE 8

        if (A != null){
            int arraySize = A.length;
            if (arraySize > 1) {
                Arrays.sort(A);
                int startNum = 1;

                for (int i = 0; i < arraySize; i++) {
                    if (A[i] != startNum++) {
                        return startNum - 1;
                    }
                }

                return arraySize + 1;
            }else if (arraySize == 1){
                if(A[0] == 2){
                    return 1;
                }else if(A[0] == 1){
                    return 2;
                }
            } else{
                return 1;
            }
        }

        return 0;
    }
}
