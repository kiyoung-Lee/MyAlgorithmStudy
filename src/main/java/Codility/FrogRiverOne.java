package Codility;

import java.util.HashSet;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        HashSet hashSet = new HashSet();
        for(int i = 0 ; i < A.length; i++){
            if(A[i] <= X){
                hashSet.add(A[i]);
            }
            if(hashSet.size() == X)
                return i;
        }
        return -1;
    }
}
