package Programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Retri_3Test {

    private Retri_3 solution;

    @Before
    public void setUp(){
        solution = new Retri_3();
    }

    @Test
    public void test_1() throws Exception {
        int [][] input = {{1,3}, {3,1}, {3,5}, {2,5}, {5,3}};
        int result = solution.solution(input);
        assertEquals(result, 2);
    }

    @Test
    public void test_2() throws Exception {
        int [][] input = {{1,3}, {1,2}, {3,4}, {4,5}, {3,1}, {3,5}, {4,3}, {2,5}, {5,3}};
        int result = solution.solution(input);
        assertEquals(result, 3);
    }
}