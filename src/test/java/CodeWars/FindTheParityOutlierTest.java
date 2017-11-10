package CodeWars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheParityOutlierTest {

    private FindTheParityOutlier solution;

    @Before
    public void setUp(){
        solution = new FindTheParityOutlier();
    }

    @Test
    public void sampleTest() throws Exception {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, solution.find(exampleTest1));
        assertEquals(206847684, solution.find(exampleTest2));
        assertEquals(0, solution.find(exampleTest3));
    }
}