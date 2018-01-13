package Programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Retri_5Test {

    private Retri_5 solution;

    @Before
    public void setUp(){
        solution = new Retri_5();
    }

    @Test
    public void test_1() throws Exception {
        int [][] monster = {{2,3}, {4,5}, {3,-3}, {2,-4}, {3,-6}, {-3,-3}, {-5,0}, {-4,4}};
        int [][] bullets = {{4,1}, {4,6}, {1,-2}, {-4,-4}, {-3,0}};
        int result = solution.solution(monster, bullets);
        assertEquals(result, 4);
    }

    @Test
    public void test_2() throws Exception {
        int [][] monster = {{1,2}, {-2,-1}, {1,-2}, {3,-1}};
        int [][] bullets = {{1,0}, {2,1}};
        int result = solution.solution(monster, bullets);
        assertEquals(result, -1);
    }

    @Test
    public void test_3() throws Exception {
        int [][] monster = {{-4,4}, {-2,2}, {6,2}, {0,-2}};
        int [][] bullets = {{3,1}, {-1,1}, {-1,1}, {0,-4}, {2,-3}};
        int result = solution.solution(monster, bullets);
        assertEquals(result, 4);
    }

}