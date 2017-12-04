package Personal;

public class BinarySearch {

    public int search(int[] arr, int left, int right, int findValue){

        while (left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] < findValue) {
                left = mid + 1;
            } else if(arr[mid] > findValue){
                right = mid;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
