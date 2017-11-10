package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {

    private PermMissingElem solution;

    @Before
    public void setUp(){
        solution = new PermMissingElem();
    }

    @Test
    public void solution_Test() throws Exception {
        int[] array = {2,3,1,5};
        int result = solution.solution(array);
        assertEquals(result, 4);
    }

    @Test
    public void solution_TwoElement_N_Test1() throws Exception {
        int[] oneElementArray = {2,3};
        int result = solution.solution(oneElementArray);
        assertEquals(result, 1);
    }

    @Test
    public void solution_TwoElement_N_Test2() throws Exception {
        int [] array = {1,2};
        int result = solution.solution(array);
        assertEquals(result,3);
    }

    @Test
    public void solution_OneElement_N_Test1() throws Exception {
        int[] oneElementArray = {2};
        int result = solution.solution(oneElementArray);
        assertEquals(result, 1);
    }

    @Test
    public void solution_OneEleMent_N_Test_2() throws Exception {
        int[] oneElementArray = {1};
        int result = solution.solution(oneElementArray);
        assertEquals(result, 2);
    }

    @Test
    public void solution_EmptyArray_Test() throws Exception {
        int [] emptyArray = {};
        int result = solution.solution(emptyArray);
        assertEquals(result, 1);
    }

    @Test
    public void solution_OneElementArray_Test() throws Exception {
        int[] oneElementArray = {1,3};
        int result = solution.solution(oneElementArray);
        assertEquals(result, 2);
    }

    @Test
    public void solution_Null_Test() throws Exception {
        int result = solution.solution(null);
        assertEquals(result, 0 );
    }
}