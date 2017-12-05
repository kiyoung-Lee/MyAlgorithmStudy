package Meeting;

// Give Sorted Pair (1,3) (2,4) (6,7) (7,9), (10,12) (11,14), (13,16)
// Merge Confict Pair
// Result = (1,4) , (6,9), (10,16)

import java.util.ArrayList;
import java.util.List;

public class MergeFair {

    public static class Pair{
        public int start;
        public int end;
    }

    public List<Pair> solution(List<Pair> pairList){
        int minValue = Integer.MAX_VALUE;
        int maxValue = 1;
        List<Pair> resultPair = new ArrayList<>();

        for(Pair pair: pairList){
            if(pair.start < minValue){
                minValue = pair.start;
            }

            if(pair.end > maxValue && pair.start <= maxValue) {
                maxValue = pair.end;
            }

            if(pair.start > maxValue){
                Pair addPair = new Pair();
                addPair.start = minValue;
                addPair.end = maxValue;
                resultPair.add(addPair);
                minValue = pair.start;
                maxValue = pair.end;
            }
        }

        Pair addPair = new Pair();
        addPair.start = minValue;
        addPair.end = maxValue;
        resultPair.add(addPair);

        return resultPair;
    }
}
