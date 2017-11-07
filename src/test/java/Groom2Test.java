import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Groom2Test {

    private Groom2 groom;

    @Before
    public void setUp(){
        groom = new Groom2();
    }

    @Test
    public void solution_Test() throws Exception {
        int param = 100;
        String result = groom.solution(param);
        assertEquals(result, "64");
    }

    @Test
    public void solution_Test2() throws Exception {
        int param = 1000;
        String result = groom.solution(param);
        assertEquals(result, "3e8");
    }

    @Test
    public void solution_Test3() throws Exception {
        int param = 16;
        String result = groom.solution(param);
        assertEquals(result, "10");
    }

    @Test
    public void solution_Test4() throws Exception {
        int param = 17;
        String result = groom.solution(param);
        assertEquals(result, "11");
    }
}