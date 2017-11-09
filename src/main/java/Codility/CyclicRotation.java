package Codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if(A != null) {

            int arraySize = A.length;

            if(K == 0 || arraySize == 0)
                return A;

            if (arraySize <= K) {
                K = K % arraySize;
            }

            int lastPos = arraySize - 1;
            int rotaionStartPos = K - 1;
            int rotationFirstItemPos = lastPos - rotaionStartPos;

            int startIdx = 0;
            int[] rotationArray = new int[arraySize];

            for (int i = rotationFirstItemPos; i < arraySize; i++) {
                rotationArray[startIdx++] = A[i];
            }

            for (int q = 0; q < rotationFirstItemPos; q++) {
                rotationArray[startIdx++] = A[q];
            }

            return rotationArray;
        }

        return null;
    }
}
