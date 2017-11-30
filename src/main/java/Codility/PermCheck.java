package Codility;

import java.util.HashSet;

public class PermCheck {

    public int solution(int[] A) {
        int arrayLength = A.length;
        int correctSum = 0;
        int arraySum = 0;
        HashSet valueSet = new HashSet();

        for(int i = 0; i < arrayLength; i++){
            int value = A[i];
            correctSum += i + 1;
            arraySum += value;

            if(valueSet.contains(value) == false){
                valueSet.add(value);
            }else{
                return 0;
            }

            if(value > arrayLength){
                return 0;
            }
        }

        if(arraySum != correctSum){
            return 0;
        }

        return 1;
    }
}
