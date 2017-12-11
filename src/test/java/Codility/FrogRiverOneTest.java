package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest {

    private FrogRiverOne solution;

    @Before
    public void setUp(){
        solution = new FrogRiverOne();
    }

    @Test
    public void solution_Test() throws Exception {
        int [] array = {1,3,1,4,2,3,5,4};
        int result = solution.solution(5, array);
        assertEquals(result, 6);
    }

    @Test
    public void oneElement_Test() throws Exception {
        int [] array = {4};
        int result = solution.solution(6, array);
        assertEquals(result, -1);
    }

    @Test
    public void oneElement_Over_Test() throws Exception {
        int [] array = {1};
        int result = solution.solution(1, array);
        assertEquals(result, 0);
    }

    @Test
    public void twoElement_smaller_than_result() throws Exception {
        int [] array = {1,2};
        int result = solution.solution(1, array);
        assertEquals(result, 0);
    }
}