package Programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Retri_1Test {

    private Retri_1 solution;

    @Before
    public void setUp(){
        solution = new Retri_1();
    }

    @Test
    public void test_1() throws Exception {
        String input = "abcz";
        int result = solution.solution(input);
        assertEquals(result, 1);
    }

    @Test
    public void test_2() throws Exception {
        String input = "zabzczxa";
        int result = solution.solution(input);
        assertEquals(result, 3);
    }

    @Test
    public void test_3() throws Exception {
        String input = "abcd";
        int result = solution.solution(input);
        assertEquals(result, 0);
    }

    @Test
    public void test_4() throws Exception {
        String input = "zaazazza";
        int result = solution.solution(input);
        assertEquals(result, 5);
    }
}