package HackerRank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RankSolutionKa3Test {

    private RankSolution_Ka3 kakao;

    @Before
    public void setUp(){
        kakao = new RankSolution_Ka3();
    }

    @Test
    public void solution_Test1() throws Exception {
        String param = "0000000";
        int result = kakao.counting2(param);
        assertEquals(result, 2);
    }



    @Test
    public void operation() throws Exception {
        int result = 1^1;
        int result1 = 1^0;
        int result2 = 0^1;
        int result3 = 0^0;

        assertEquals(result, 0);
        assertEquals(result1, 1);
        assertEquals(result2, 1);
        assertEquals(result3, 0);
    }
}