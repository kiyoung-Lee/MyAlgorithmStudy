import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ebay1Test {

    private Ebay1 solution;

    @Before
    public void setUp(){
        solution = new Ebay1();
    }

    @Test
    public void solution_Test() throws Exception {
        String[] playList = {"hi", "ho", "hello", "hello"};
        int k = 0;
        String findName = "hello";
        int result = Ebay1.playlist(playList, k, findName);
        assertEquals(result, 1);
    }

    @Test
    public void single_Song_Test() throws Exception {

        int result = 0;
        assertEquals(result, 0 );
    }


}