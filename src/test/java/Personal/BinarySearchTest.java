package Personal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private BinarySearch solution;

    @Before
    public void setUp(){
        solution = new BinarySearch();
    }

    @Test
    public void sample_Test() throws Exception {
        int[] arr = {1,2,3,4,5};
        int result = solution.search(arr, 0, 4, 3);
        System.out.println(result);
    }
}