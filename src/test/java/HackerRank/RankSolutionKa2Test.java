import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Kakao2Test {

    private Kakao2 kakao;

    @Before
    public void setUp(){
        kakao = new Kakao2();
    }

    @Test
    public void solution_Test1() throws Exception {
        String[] param = {"Philipee I", "Philip II"};
        String[] result = kakao.getSortedList(param);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void solution_Test2() throws Exception {
        String[] param = {"Louis IX", "Louis VIII", "Philipee III", "Philipee II"};
        String[] result = kakao.getSortedList(param);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void transTest() throws Exception {
        String rome = "XLVII";
        int result = kakao.romaToArabia(rome);
        assertEquals(result, 47);
    }
}