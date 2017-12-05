package Meeting;

import Meeting.Fibonacci;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci solution;

    @Before
    public void setUp(){
        solution = new Fibonacci();
    }

    @Test
    public void sample_Test() throws Exception {
        int result = solution.solution(0);
        assertEquals(result, 0);
    }

    @Test
    public void sample_Test_1() throws Exception {
        int result = solution.solution(1);
        assertEquals(result, 1);
    }

    @Test
    public void sample_Test_2() throws Exception {
        int result = solution.solution(2);
        assertEquals(result, 1);
    }

    @Test
    public void sample_Test3() throws Exception {
        int result = solution.solution(3);
        assertEquals(result, 2);
    }

    @Test
    public void sample_Test4() throws Exception {
        int result = solution.solution(7);
        assertEquals(result, 13);
    }
}