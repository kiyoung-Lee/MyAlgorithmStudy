import Groom.Groom3;
import org.junit.Before;
import org.junit.Test;

public class Groom3Test {

    private Groom3 groom;

    @Before
    public void setUp(){
        groom = new Groom3();
    }

    @Test
    public void solution_Test1() throws Exception {
        int param = 20;
        String result = groom.solution(param);
        System.out.println(result);
    }

    @Test
    public void solution_Test2() throws Exception {
        int param = 100;
        String result = groom.solution(param);
        System.out.println(result);
    }
}