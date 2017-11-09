package Codility;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class CyclicRotationTest {

    private CyclicRotation solution;

    @Before
    public void setUp(){
        solution = new CyclicRotation();
    }

    @Test
    public void solution_Test1() throws Exception {
        int [] array = {3,8,9,7,6};
        int k = 3;
        int[] result = solution.solution(array,k);

        assertEquals(result[0], 9);
        assertEquals(result[1], 7);
        assertEquals(result[2], 6);
        assertEquals(result[3], 3);
        assertEquals(result[4], 8);
    }

    @Test
    public void solution_Test_EmptyArray_Valid_K_Test() throws Exception {
        int[] emptyArray = {};
        int k = 1;
        int[] result = solution.solution(emptyArray,k);

        assertEquals(result.length, 0 );
    }

    @Test
    public void solution_Test_EmptyArray_Invalid_K_Test() throws Exception {
        int[] emptyArray = {};
        int k = 0;
        int[] result = solution.solution(emptyArray,k);

        assertEquals(result.length, 0 );
    }

    @Test
    public void solution_Test_ValidArray_Invalid_K_Test() throws Exception {
        int[] validArray = {1,2,3,4};
        int k = 0;

        int[] result = solution.solution(validArray, k);
        assertEquals(result, validArray);
    }

    @Test
    public void solution_Test_NullArray_Invalid_K_Test() throws Exception {
        int[] nullArray = null;
        int k = 0;

        int[] result = solution.solution(nullArray, k);
        assertNull(result);
    }

    @Test
    public void solution_Test_NullArray_Valid_K_Test() throws Exception {
        int[] nullArray = null;
        int k = 1;

        int[] result = solution.solution(nullArray, k);
        assertNull(result);
    }

    @Test
    public void solution_Test_2() throws Exception {
        // K >= N
        int [] array = {-1,-2,-3,-4,-5};
        int k = 6;

        int[] result = solution.solution(array,k);

        assertEquals(result[0], -5);
        assertEquals(result[1], -1);
        assertEquals(result[2], -2);
        assertEquals(result[3], -3);
        assertEquals(result[4], -4);
    }
}