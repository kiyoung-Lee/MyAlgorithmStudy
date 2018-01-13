package Programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Retri_4Test {

    private Retri_4 solution;

    @Before
    public void setUp(){
        solution = new Retri_4();
    }

    @Test
    public void test_1() throws Exception {
        int n = 9;
        int k = 3;
        int result = solution.solution(n, k);
        assertEquals(result, 3);
    }

    @Test
    public void test_2() throws Exception {
        int n = 10;
        int k = 2;
        int result = solution.solution(n, k);
        assertEquals(result, 4);
    }

    @Test
    public void test_3() throws Exception {
        int n = 9;
        int k = 4;
        int result = solution.solution(n, k);
        assertEquals(result, 0);
    }
}