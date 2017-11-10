package CodeWars;

// x Simple, given a string of words, return the length of the shortest word(s).
//String will never be empty and you do not need to account for different data types.

public class ShortestWord{

    public int findShort(String s) {
        int minLength = Integer.MAX_VALUE;
        String[] splitWord = s.split(" ");

        for(String word : splitWord){
            if(word.length() < minLength){
                minLength = word.length();
            }
        }

        return minLength;
    }
}
