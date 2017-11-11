package HackerRank;

public class RankSolution_Eb1 {


    static int playlist(String[] songs, int k, String q) {
        int arraySize = songs.length;
        int currentPos = k;
        String findSongName = q;

        boolean isFind = false;
        int upCount = 0;
        int downCount = 0;

        for(int i = currentPos; i < arraySize; i++){
            if(songs[i].equals(findSongName)){
                isFind = true;
                break;
            }else{
                upCount++;
            }
        }

        if(isFind == false) {
            for (int i = 0; i < currentPos; i++) {
                if (songs[i].equals(findSongName)) {
                    isFind = true;
                    break;
                } else {
                    upCount++;
                }
            }
        }

        isFind = false;

        for(int i = currentPos; i > -1; i--){
            if(songs[i].equals(findSongName)){
                isFind = true;
                break;
            }else{
                downCount++;
            }
        }

        if(isFind == false){
            for(int i = arraySize - 1; i > -1; i--){
                if(songs[i].equals(findSongName)){
                    isFind = true;
                    break;
                }else{
                    downCount++;
                }
            }
        }

        if(upCount > downCount){
            return  downCount;
        } else{
            return  upCount;
        }
    }
}
