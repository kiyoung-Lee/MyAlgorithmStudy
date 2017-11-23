package Codility;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        if(X == Y)
            return 0;

        int distance = Y - X;

        int nam = distance % D;

        if(nam == 0){
            return distance / D;
        }else {
            return distance / D + 1;
        }
    }
}
