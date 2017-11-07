import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class MainTest {

    private Main mainClass;

    @Before
    public void setUp(){
        mainClass = new Main();
    }

    @Test
    public void solution_Test() throws Exception {
        int result = mainClass.solution(9);
        assertEquals(result, 2);

        int result2 = mainClass.solution(1041);
        assertEquals(result2, 5);
    }

    @Test
    public void getBinaryList_Test() throws Exception {
        List<Integer> binaryList = mainClass.getBinaryList(9);

        assertNotNull(binaryList);
        assertEquals(binaryList.get(0), new Integer(1));
        assertEquals(binaryList.get(1), new Integer(0));
        assertEquals(binaryList.get(2), new Integer(0));
        assertEquals(binaryList.get(3), new Integer(1));
    }
}