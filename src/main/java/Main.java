import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public int solution(int N){
        List<Integer> binaryList = getBinaryList(N);

        boolean start = false;
        int tempCcount = 0;
        int maxCount = 0;

        for(Integer binary : binaryList){
            if(start){
                tempCcount ++;
            }

            if(binary == 0){
                start =true;
            }else{
                start = false;
                if(maxCount < tempCcount){
                    maxCount = tempCcount;
                }
                tempCcount = 0;
            }
        }

        return maxCount;
    }

    public List<Integer> getBinaryList(int N){
        List<Integer> numList = new ArrayList<>();

        while (N != 0){
            int remainder = N % 2;
            numList.add(remainder);
            N = N / 2;
        }

        Collections.reverse(numList);
        return numList;
    }
}
