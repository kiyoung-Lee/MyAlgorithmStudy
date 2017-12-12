package Codility;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8

        HashSet hashSet = new HashSet();

        for(int value : A){
            hashSet.add(value);
        }

        for(int i = 1; i < hashSet.size() + 1; i ++){
            if(hashSet.contains(i) == false){
                return i;
            }
        }

        return hashSet.size() + 1;
    }
}
