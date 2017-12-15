package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivTest {

    private CountDiv solution;

    @Before
    public void setUp(){
        solution = new CountDiv();
    }

    @Test
    public void test() throws Exception {
        int result = solution.solution(6, 11, 2);
        assertEquals(result, 3);
    }

    @Test
    public void solution_Test1() throws Exception {
        int result = solution.solution(1, 10, 2);
        assertEquals(result, 5);
    }

    @Test
    public void solution_Test() throws Exception {
        int result = solution.solution(1, 10, 3);
        assertEquals(result, 3);
    }

    @Test
    public void solution_Test2() throws Exception {
        int result = solution.solution(0, 2, 3);
        assertEquals(result, 1);
    }

    @Test
    public void solution_Test3() throws Exception {
        int result = solution.solution(1, 1, 3);
        assertEquals(result, 0);
    }

    @Test
    public void solution_Test4() throws Exception {
        int result = solution.solution(1, 1, 1);
        assertEquals(result, 1);
    }

    @Test
    public void solution_Test5() throws Exception {
        int result = solution.solution(2, 2, 3);
        assertEquals(result, 0);
    }

    @Test
    public void solution_Test6() throws Exception {
        int result = solution.solution(2, 10, 2);
        assertEquals(result, 5);
    }

    @Test
    public void solution_Test7() throws Exception {
        int result = solution.solution(3, 9, 2);
        assertEquals(result, 3);
    }

    @Test
    public void solution_Test8() throws Exception {
        int result = solution.solution(2, 9, 2);
        assertEquals(result, 4);
    }

    @Test
    public void solution_Test9() throws Exception {
        int result = solution.solution(11, 345, 17);
        assertEquals(result, 20);
    }

    @Test
    public void solution_Test10() throws Exception {
        int result = solution.solution(0, 0, 11);
        assertEquals(result, 1);
    }

    @Test
    public void solution_Test11() throws Exception {
        int result = solution.solution(1, 1, 11);
        assertEquals(result, 0);
    }

    @Test
    public void solution_Test12() throws Exception {
        int result = solution.solution(0, 2000000000, 1);
        assertEquals(result, 2000000001);
    }

    @Test
    public void solution_Test13() throws Exception {
        int result = solution.solution(0, 3, 1);
        assertEquals(result, 4);
    }
}