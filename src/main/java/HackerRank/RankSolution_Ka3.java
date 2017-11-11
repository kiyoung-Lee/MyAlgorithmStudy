public class Kakao3 {

    public int counting(String s){
        String[] splitArray = s.split("");
        int count = 0;

        for(int i = 0; i < splitArray.length; i ++){
            if(i <=  splitArray.length - 2) {
                int first = Integer.valueOf(splitArray[i]);
                int second = Integer.valueOf(splitArray[i + 1]);

                int xor = first ^ second;
                int and = first & second;

                if (xor == 1 || and == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    int count = 0;
    int matchCount = 0;
    int groupCount = 0;
    int arraySize = 0;

    public int counting2(String s){
        String[] splitArray = s.split("");
        arraySize = splitArray.length;


        for(int i = 0; i < arraySize; i ++){
            groupCount = 1;
            matchCount = 0;
            for(int q = i + 1; q < arraySize; q++){
                int splitFirstValue = Integer.valueOf(splitArray[i]);
                int splitEndValue = Integer.valueOf(splitArray[q]);

                if(splitFirstValue == 0){
                    if(splitEndValue == 0) {

                        boolean isBreak = samleValueOperation();
                        if(isBreak)
                            break;
                        else
                            continue;

                    }
                    else {
                        boolean isBreak = differValueOperation(i, q);
                        if(isBreak)
                            break;

                    }
                }else {
                    if(splitEndValue == 1) {
                        boolean isBreak = samleValueOperation();
                        if(isBreak)
                            break;
                        else
                            continue;
                    }
                    else {
                        boolean isBreak = differValueOperation(i, q);
                        if(isBreak)
                            break;
                    }
                }
            }
        }

        return count;
    }

    private boolean samleValueOperation(){
        if(matchCount == groupCount) {
            count ++;
            return true;
        }else {
            groupCount++;
            return false;
        }
    }
    private boolean differValueOperation(int i , int q){
        if(matchCount == groupCount) {
            count ++;
            return true;
        }else {
            matchCount++;
            if (i == arraySize - 2 && q == arraySize - 1) {
                if (matchCount == groupCount) {
                    count++;
                    return true;
                }
            }
        }
        return false;
    }
}
