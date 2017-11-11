import java.util.*;

public class Kakao2 {

    private static char[] signs = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    private static int[] values = {1, 5, 10, 50, 100, 500, 1000};

    public String[] getSortedList(String[] names){
        String[] cloneArray = names.clone();
        Arrays.sort(names);

        int lastIdx = 0;
        int sortPos = 0;
        String currentName = "";
        List<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < names.length; i ++){

            String[] splitName = names[i].split(" ");
            if(splitName.length == 2){
                String name = splitName[0];
                String number = splitName[1];
                numberList.add(romaToArabia(splitName[1]));

                if(currentName.equals(name) == false){
                    Collections.sort(numberList);
                    sortPos = lastIdx;
                    for(Integer sortedIdx : numberList) {
                        for (int q = lastIdx; q < i; q++) {
                            String[] sortSplitName = names[q].split(" ");
                            if(splitName.length == 2) {
                                String sortName = sortSplitName[0];
                                String sortNumber = sortSplitName[1];
                                if (sortedIdx == romaToArabia(sortNumber)){
                                    cloneArray[sortPos++] = names[q];
                                }
                            }
                        }
                    }

                    currentName = name;
                    numberList = new ArrayList<>();
                }
            }
        }

        return cloneArray;
    }

    public int romaToArabia(String roma) {
        int pre = 0;
        int sum = 0;
        for(char ch : roma.toCharArray()) {
            int v = getValue(ch);
            if(pre != 0) {
                if(pre < v) {
                    sum -= pre * 2;
                }
            }
            sum += v;
            pre = v;
        }
        return sum;
    }

    private int getValue(char sign) {
        for(int i = 0; i < signs.length; i++) {
            if(signs[i] == sign) {
                return values[i];
            }
        }
        return 0;
    }
}

