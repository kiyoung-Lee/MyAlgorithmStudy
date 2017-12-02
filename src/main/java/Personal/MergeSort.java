package Personal;

public class MergeSort {

    int currentArrayPos = 0;

    public void mergeSort(int [] arr, int start, int end){

        int arrayLength = arr.length;
        int mid = arrayLength / 2;

        if(arrayLength == 1)
            return;

        int [] leftArray = new int[mid];
        int [] rightArray = new int [end - mid];


        for(int i = 0; i < mid; i++){
            leftArray[i] = arr[start ++];
        }

        int rightArrayPos = mid;
        for(int q = mid; mid < arrayLength; q++){
            rightArray[q] = arr[rightArrayPos ++];
        }

        mergeSort(leftArray, 0, mid);
        mergeSort(rightArray, mid + 1, arrayLength);
        conquer(arr, leftArray, rightArray);
    }

    private void conquer(int[] arr, int[] leftArray, int[] rightArray){
        int leftPos = 0;
        int rightPos = 0;


        while(leftPos != leftArray.length - 1 || rightPos != rightArray.length - 1){
            if(leftArray[leftPos] > rightArray[rightPos]){
                arr[currentArrayPos ++] = rightArray[rightPos ++];
            }else if(leftArray[leftPos] < rightArray[rightPos]){
                arr[currentArrayPos ++] = leftArray[leftPos ++];
            }
        }

        if(leftPos != leftArray.length -1){
            while (leftPos != leftArray.length -1){
                arr[currentArrayPos++] = leftArray[leftPos++];
            }
        }

        if(rightPos != rightArray.length - 1){
            while (rightPos != rightArray.length - 1){
                arr[currentArrayPos++] = rightArray[rightPos++];
            }
        }
    }
}
