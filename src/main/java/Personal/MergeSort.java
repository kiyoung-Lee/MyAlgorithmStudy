package Personal;

public class MergeSort {

    int arraySize = 6;

    public void mergeSort(int [] arr, int left, int right){

        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            sort(arr, left, mid, right);
        }
    }

    private void sort(int[] arr, int left, int mid, int right){
        int i = left;
        int q = mid + 1;
        int p = left;
        int[] tempArray = new int[arraySize];

        while (i <= mid && q <= right){
            if(arr[i] < arr[q]){
                tempArray[p++] = arr[i++];
            }else{
                tempArray[p++] = arr[q++];
            }
        }

        if(i < mid + 1){
            for(int t = i; t <= mid; t++){
                tempArray[p++] = arr[t];
            }
        }else if(q < right + 1){
            for(int s = q; s <= right; s++){
                tempArray[p++] = arr[s];
            }
        }

        for(int m = left; m <= right; m++){
            arr[m] = tempArray[m];
        }
    }
}
