package Personal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    private QuickSort solution;

    @Before
    public void setUp(){
        solution = new QuickSort();
    }

    @Test
    public void sample_Test() throws Exception {
        int[] arr = {5,4,3,2,1};
        solution.quick(arr, 0, 4);
        for(int value : arr){
            System.out.println(value);
        }
    }
}