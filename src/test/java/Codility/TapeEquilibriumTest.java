package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    private TapeEquilibrium solution;

    @Before
    public void setUp(){
        solution = new TapeEquilibrium();
    }

    @Test
    public void solution_Test1() throws Exception {
        int[] array = {3,1,2,4,3};
        int result = solution.solution(array);
        assertEquals(result, 1);
    }

    @Test
    public void solution_2_Element_Test() throws Exception {
        int[] array = {2,2};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void solution_2_Element_Test2() throws Exception {
        int[] array = {-2, 2};
        int result = solution.solution(array);
        assertEquals(result, 4);
    }

    @Test
    public void solution_3_Element_Test1() throws Exception {
        int[] array = {-1, 0 ,1};
        int result = solution.solution(array);
        assertEquals(result, 2);
    }

    @Test
    public void solution_3_Element_Test2() throws Exception {
        int[] array = {-3, -2, -1};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }
}