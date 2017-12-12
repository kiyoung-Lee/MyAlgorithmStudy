package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    private MissingInteger solution;

    @Before
    public void setUp(){
        solution = new MissingInteger();
    }

    @Test
    public void solution_Test() throws Exception {
        int [] array = {1,3,6,4,1,2};
        int result = solution.solution(array);
        assertEquals(result, 5);
    }

    @Test
    public void solution_Test1() throws Exception {
        int [] array = {1,2,3};
        int result = solution.solution(array);
        assertEquals(result, 4);
    }

    @Test
    public void solution_Test2() throws Exception {
        int [] array = {-1, -3};
        int result = solution.solution(array);
        assertEquals(result, 1);
    }

    @Test
    public void solution_Test3() throws Exception {
        int [] array = {1,3,6};
        int result = solution.solution(array);
        assertEquals(result, 2);
    }
}