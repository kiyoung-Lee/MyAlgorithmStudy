package Groom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Groom2 {

    /*
    입력 받은 10진수를 16진수로 출력하는 프로그램을 작성하십시오.

    입력

    10 진수 형 정수

    출력

    16진수로 변환된 입력
     */

    public String solution(int n){
        String [] mappingArray = {"1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

        List<String> splitList = new ArrayList<>();
        int flagNum = n;

        while (flagNum != 0){
            splitList.add(String.valueOf(flagNum % 16));
            flagNum = flagNum / 16;
        }

        Collections.reverse(splitList);

        String result = "";

        for(String item : splitList){
            int position = Integer.valueOf(item) + -1;
            if(position > -1 )
                result += mappingArray[position];
            else
                result += "0";
        }

        return result;
    }
}
