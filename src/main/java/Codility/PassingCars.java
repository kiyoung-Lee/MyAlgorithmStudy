package Codility;

public class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int arraySize = A.length;
        if(arraySize > 1000000000)
            return -1;
        else
            return arraySize;
    }
}
