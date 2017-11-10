package CodeWars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestWordTest {

    private ShortestWord solution;

    @Before
    public void setUp(){
        solution = new ShortestWord();
    }

    @Test
    public void findShort() throws Exception {
        assertEquals(3, solution.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, solution.findShort("turns out random test cases are easier than writing out basic ones"));
    }
}