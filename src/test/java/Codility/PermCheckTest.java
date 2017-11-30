package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermCheckTest {

    private PermCheck solution;

    @Before
    public void setUp(){
        solution = new PermCheck();
    }

    @Test
    public void sample_Test1() throws Exception {
        int [] array = {4,1,3,2};
        int result = solution.solution(array);
        assertEquals(result, 1);
    }

    @Test
    public void sample_Test2() throws Exception {
        int [] array = {4,1,3};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void sample_Test3() throws Exception {
        int [] array = {1,3};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void sample_Test4() throws Exception {
        int [] array = {2,3};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void singleElement_Test() throws Exception {
        int [] array = {1};
        int result = solution.solution(array);
        assertEquals(result, 1);
    }

    @Test
    public void singleElement_Test2() throws Exception {
        int [] array = {2};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void twiceElement_Test() throws Exception {
        int [] array = {1,1};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void twiceElement_Test2() throws Exception {
        int [] array = {1,2,2,3};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void correctSum_ArraySum_Equal_But_Not_Permutation() throws Exception {
        int [] array = {2,2,2};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }

    @Test
    public void correctSum_ArraySum_Eqaul_But_NotPermutation2() throws Exception {
        int [] array = {1,1,4};
        int result = solution.solution(array);
        assertEquals(result, 0);
    }
}