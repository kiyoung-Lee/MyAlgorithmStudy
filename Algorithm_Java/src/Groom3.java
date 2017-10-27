import java.util.HashSet;

public class Groom3 {
    /*
    양의 정수를 입력 받고 그 수의 약수를 모두 출력하는 프로그램을 작성하십시오.

    입력

    양의 정수

    출력

    입력된 수의 약수를 공백으로 구분하여 출력
     */

    public String solution(int n){

        String result = "";

        HashSet<Integer> keySet = new HashSet<>();

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                if(keySet.contains(i) == false){
                    keySet.add(i);
                    keySet.add(n / i);
                }else{
                    break;
                }
            }
        }

        for(Integer key : keySet){
            result += key + "_";
        }

        return result;
    }
}
