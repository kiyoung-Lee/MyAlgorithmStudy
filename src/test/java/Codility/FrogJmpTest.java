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
}