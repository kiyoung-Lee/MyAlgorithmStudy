package Programmers;

public class Retri_1 {
    boolean findA = false;
    boolean findB = false;
    int resultCount = 0;
    String findChar = "";

    public int solution(String s) {

        String [] splisList = s.split("");

        for(int i = 0; i < splisList.length; i ++){
            flagReset();
            for(int q = i + 1; q < splisList.length; q++){
                if(findA == true && findB == true){
                    continue;
                }

                if((splisList[i].equals("a") || splisList[i].equals("z"))
                                            && findA == false){
                    if(findChar.equals(splisList[i]) == false) {
                        findChar = splisList[i];
                    }else{
                        break;
                    }

                    findA = true;
                    if(findB == true){
                        findPair();
                        break;
                    }
                }

                if((splisList[q].equals("a") || splisList[q].equals("z"))
                                            && findB == false){
                    if(findChar.equals(splisList[q]) == false) {
                        findChar = splisList[q];
                    }else{
                        break;
                    }

                    findB = true;
                    if(findA == true){
                        findPair();
                        break;
                    }
                }
            }
        }

        return resultCount;
    }

    private void findPair(){
        resultCount ++;
        flagReset();
    }

    private void flagReset(){
        findA = false;
        findB = false;
        findChar = "";
    }
}
