
public class SortAlgorithm {
	
	private static final int ITEM_SIZE = 8;
	
    public void BubbleSort() throws Exception {
        int[] array = new int[] {4,2,10,35,3,12,54,23};
        int temp = -1;

        for(int count : array){
            System.out.print(count + ",");

        }

        System.out.println("");

        for(int q = array.length; q > 0; q--) {
            for (int i = 0; i < q -1; i++) {
                int comparePos = i + 1;

                if (array[i] > array[comparePos]) {
                    temp = array[comparePos];
                    array[comparePos] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int count : array){
            System.out.print(count + ",");
        }
    }
    
    public void SelectionSort() throws Exception {
        int[] array = new int[] {4,2,10,35,3,12,54,23};
        int temp = -1;
        int minValue = Integer.MAX_VALUE;
        int selectIdx = -1;

        for(int count : array){
            System.out.print(count + ",");
        }

        System.out.println("");

        for(int i = 0; i < array.length - 1; i++){
            minValue = array[i];
            for(int q = i + 1; q < array.length; q ++){
                if(array[q] < minValue){
                    minValue = array[q];
                    selectIdx = q;
                }
            }

            temp = array[selectIdx];
            array[selectIdx] = array[i];
            array[i] = temp;
        }

        for(int count : array){
            System.out.print(count + ",");
        }
    }
    
    public void mergeSort() throws Exception {
        int[] array = new int[] {4,2,10,35,3,12,54,23};

        for(int count : array){
            System.out.print(count + ",");
        }

        System.out.println("");

        divide_merge(array, 0, ITEM_SIZE -1);

        for(int count : array){
            System.out.print(count + ",");
        }

        System.out.println("");
    }

    private void divide_merge(int[] arr, int left, int right){

        if(left == right)
            return ;
        int mid = (left + right) / 2;

        divide_merge(arr, left, mid);
        divide_merge(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right){

        int i = left;
        int j = mid + 1;
        int idx = left;

        int[] tempArray = new int[ITEM_SIZE];

        while (i <= mid && j <= right){
            if(array[i] < array[j]){
                tempArray[idx] = array[i];
                i++;
            } else{
                tempArray[idx] = array[j];
                j++;
            }
            idx ++;
        }

        if(i <= mid){
            for(int m = i; m <= mid; m++){
                tempArray[idx] = array[m];
                idx ++;
            }
        }else if(j <= right){
            for(int q = j; q <= right; q++){
                tempArray[idx] = array[q];
                idx++;
            }
        }

        for(int m = left; m <= right; m++){
            array[m] = tempArray[m];
        }
    }
}
