package Personal;

public class QuickSort {

    public void quick(int[] arr, int left, int right){

        int part = sort(arr, left, right);

        if(left < part -1){
            quick(arr, left, part -1);
        }
        if(part < right){
            quick(arr, part, right);
        }
    }

    private int sort(int[] arr, int left, int right) {

        int i = left;
        int q = right;
        int mid = arr [ (left + right) /2 ];

        while(i <= q){

            while (arr[i] < mid)
                i++;
            while (arr[q] > mid )
                q --;

            if(i <= q){
                int temp = arr[i];
                arr[i] = arr[q];
                arr[q] = temp;
                i++;
                q--;
            }
        }

        return i;
    }
}
