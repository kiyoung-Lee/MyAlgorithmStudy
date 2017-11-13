package HackerRank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RankSolutionEb1Test {

    private RankSolution_Eb1 solution;

    @Before
    public void setUp(){
        solution = new RankSolution_Eb1();
    }

    @Test
    public void solution_Test() throws Exception {
        String[] playList = {"hi", "ho", "hello", "hello"};
        int k = 0;
        String findName = "hello";
        int result = RankSolution_Eb1.playlist(playList, k, findName);
        assertEquals(result, 1);
    }

    @Test
    public void single_Song_Test() throws Exception {

        int result = 0;
        assertEquals(result, 0 );
    }


}