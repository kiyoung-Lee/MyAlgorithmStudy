package Programmers;

public class Retri_3 {

    public int solution(int [][] p){

        int start;
        int end;
        int result = 0;

        for(int i = 0; i < p.length; i++){
            start = p[i][0];
            end = p[i][1];

            for(int q = i + 1; q <p.length; q++){
                if(p[q][0] == end && p[q][1] == start){
                    result ++;
                }
            }
        }

        return result;
    }
}
