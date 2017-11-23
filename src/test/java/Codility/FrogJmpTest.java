package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {

    private FrogJmp solution;

    @Before
    public void setUp(){
        solution = new FrogJmp();
    }

    @Test
    public void solution_Test() throws Exception {
        int result = solution.solution(10, 85, 30);
        assertEquals(result, 3);
    }

    @Test
    public void solution_Distance_Same_Test() throws Exception {
        int result = solution.solution(10, 10, 30);
        assertEquals(result, 0);
    }

    @Test
    public void solution_Distance_Same_Test2() throws Exception {
        int result = solution.solution(10, 10, 5);
        assertEquals(result, 0);
    }

    @Test
    public void solution_Test2() throws Exception {
        int result = solution.solution(1, 2, 5);
        assertEquals(result, 1);
    }

    @Test
    public void solution_Test3() throws Exception {
        int result = solution.solution(1, 3, 1);
        assertEquals(result, 2);
    }

    @Test
    public void solution_Test4() throws Exception {
        int result = solution.solution(1, 3, 2);
        assertEquals(result, 1);
    }

    @Test
    public void solution_Test5() throws Exception {
        int result = solution.solution(1, 4, 2);
        assertEquals(result, 2);
    }
}