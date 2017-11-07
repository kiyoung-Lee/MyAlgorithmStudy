import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Groom1Test {

    Groom1 groom;

    @Before
    public void setUp(){
        groom = new Groom1();
    }

    @Test
    public void solution_Test1() throws Exception {
        int param = 2000;
        String result = groom.solution(param);
        assertEquals(result, "Leap Year");
    }

    @Test
    public void solution_Test2() throws Exception {
        int param = 2100;
        String result = groom.solution(param);
        assertEquals(result, "Not Leap Year");
    }

    @Test
    public void solution_Test3(){
        int param = 3;
        String result = groom.solution(param);
        assertEquals(result, "Not Leap Year");
    }
}