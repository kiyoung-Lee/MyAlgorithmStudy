package HackerRank;

import java.util.HashSet;

public class RankSolution_Eb3 {

    static int numberOfPairs(int[] a, long k) {
        long sumValue = k;
        int arraySize = a.length;
        int startIdx = 0;

        HashSet<String> pairSet = new HashSet<>();

        if(a != null) {
            if (arraySize > 0) {
                while (startIdx != arraySize) {
                    for (int i = 0; i < arraySize; i++) {
                        if (startIdx != i) {
                            long sum = Long.valueOf(a[i]) + Long.valueOf(a[startIdx]);
                            if (sum == sumValue) {
                                if (a[i] > a[startIdx]) {
                                    pairSet.add(a[startIdx] + "," + a[i]);
                                } else {
                                    pairSet.add(a[i] + "," + a[startIdx]);
                                }
                            }
                        }
                    }
                    startIdx++;
                }
            }
        }

        return pairSet.size();
    }
}
