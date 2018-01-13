package Programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Retri_2Test {

    private Retri_2 solution;

    @Before
    public void setUp(){
        solution = new Retri_2();
    }

    @Test
    public void test_1() throws Exception {
        int input = 2;
        String result =  solution.solution(input);
        assertEquals(result, "11");
    }

    @Test
    public void test_2() throws Exception {
        int input = 5;
        String result =  solution.solution(input);
        assertEquals(result, "122111");
    }

    @Test
    public void test_3() throws Exception {
        int input = 3;
        String result =  solution.solution(input);
        assertEquals(result, "12");
    }

    @Test
    public void test_4() throws Exception {
        int input = 4;
        String result =  solution.solution(input);
        assertEquals(result, "1121");
    }

    @Test
    public void test_5() throws Exception {
        int input = 6;
        String result =  solution.solution(input);
        assertEquals(result, "112213");
    }

    @Test
    public void test_6() throws Exception {
        int input = 7;
        String result =  solution.solution(input);
        assertEquals(result, "12221131");
    }

    @Test
    public void test_7() throws Exception {
        int input = 8;
        String result =  solution.solution(input);
        assertEquals(result, "1123123111");
    }
}