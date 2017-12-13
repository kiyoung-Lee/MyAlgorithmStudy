package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCountersTest {

    private MaxCounters solution;

    @Before
    public void setUp(){
        solution = new MaxCounters();
    }

    @Test
    public void solution_Test() throws Exception {
        int [] param = {3,4,4,6,1,4,4};
        int [] result = solution.solution(5, param);

        for(int value : result){
            System.out.println(value);
        }
    }

    @Test
    public void solution_Test1() throws Exception {
        int [] param = {-1, -1, -1};
        int [] result = solution.solution(5, param);

        for(int value : result){
            System.out.println(value);
        }
    }
}