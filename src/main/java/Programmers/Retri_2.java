package Programmers;

public class Retri_2 {
    public String solution(int n) {

        String initNumber = "1";
        int number = 0;
        int beforeNum = 0;
        int count = 0;

        if(n == 1)
            return "1";

        for(int i = 0; i < n - 1; i++){
            String[] splistList = initNumber.split("");
            StringBuilder result = new StringBuilder();

            for(int q = 0; q < splistList.length; q++){

                number = Integer.valueOf(splistList[q]);

                if(q == 0){
                    beforeNum = number;
                }

                if(beforeNum != number){
                    result.append(beforeNum);
                    result.append(count);

                    beforeNum = number;
                    count = 1;
                }else{
                    count ++;
                }
            }

            result.append(beforeNum);
            result.append(count);

            beforeNum = number;
            count = 0;
            initNumber = result.toString();
        }

        return initNumber;
    }
}
