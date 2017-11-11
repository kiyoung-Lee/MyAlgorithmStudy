import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Kakao1 {

    Map<String, String> dayMap = new HashMap<>();
    Map<String, String> monthMap = new HashMap<>();

    public String[] reformat(String[] dates){
        setDayMap();
        setMonthMap();

        int dateArraySize = dates.length;
        String[] convertResultArray = new String[dateArraySize];

        for(int i = 0; i < dates.length; i ++){
            String date = dates[i];
            String[] splitDate = date.split(" ");
            if(splitDate.length == 3){
                String day = dayMap.get(splitDate[0]);
                String month = monthMap.get(splitDate[1]);
                String year = splitDate[2];
                String convertResult = year + "-" + month + "-" + day;
                convertResultArray[i] = convertResult;
            }
        }

        return convertResultArray;
    }

    private void setDayMap(){
        dayMap.put("1st", "01");
        dayMap.put("2nd", "02");
        dayMap.put("3rd", "03");
        dayMap.put("4th", "04");
        dayMap.put("5th", "05");
        dayMap.put("6th", "06");
        dayMap.put("7th", "07");
        dayMap.put("8th", "08");
        dayMap.put("9th", "09");
        dayMap.put("10th", "10");
        dayMap.put("11th", "11");
        dayMap.put("12th", "12");
        dayMap.put("13th", "13");
        dayMap.put("14th", "14");
        dayMap.put("15th", "15");
        dayMap.put("16th", "16");
        dayMap.put("17th", "17");
        dayMap.put("18th", "18");
        dayMap.put("19th", "19");
        dayMap.put("20th", "20");
        dayMap.put("21th", "21");
        dayMap.put("22th", "22");
        dayMap.put("23th", "23");
        dayMap.put("24th", "24");
        dayMap.put("25th", "25");
        dayMap.put("26th", "26");
        dayMap.put("27th", "27");
        dayMap.put("28th", "28");
        dayMap.put("29th", "29");
        dayMap.put("30th", "30");
        dayMap.put("31th", "31");
    }

    private void setMonthMap(){
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
    }
}
