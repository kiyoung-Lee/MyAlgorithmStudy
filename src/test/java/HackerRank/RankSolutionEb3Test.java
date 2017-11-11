import org.junit.Test;

import static org.junit.Assert.*;

public class Ebay4Test {

    @Test
    public void solution_Test() throws Exception {
        int[] array = {1,3,46,1,3,9};
        int k = 47;
        int result = Ebay4.numberOfPairs(array, k);
        assertEquals(result, 1);
    }

    @Test
    public void emptyList_Test() throws Exception {
        int[] array = {};
        int k = 1;
        int result = Ebay4.numberOfPairs(array, k);
        assertEquals(result, 0);
    }


}