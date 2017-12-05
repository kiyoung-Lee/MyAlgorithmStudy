package Personal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    private MergeSort solution;

    @Before
    public void setUp(){
        solution = new MergeSort();
    }

    @Test
    public void sample_Test1() throws Exception {
        int [] arr = {5,4,3,2,1};
        solution.mergeSort(arr, 0, 4);
        for (int value: arr) {
            System.out.println(value);
        }
    }

    @Test
    public void samle_Test2() throws Exception {
        int [] arr = {3,8,0,2,1,4};
        solution.mergeSort(arr, 0, 5);
        for (int value: arr) {
            System.out.println(value);
        }
    }
}