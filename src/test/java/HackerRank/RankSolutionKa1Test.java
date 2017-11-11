import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class Kakao1Test {

    private Kakao1 kakao;

    @Before
    public void setUp(){
        kakao = new Kakao1();
    }

    @Test
    public void solution_Test1() throws Exception {

        String[] dates = {"25th Dec 2016"};
        String [] resultArray = kakao.reformat(dates);

        for(String result : resultArray){
            System.out.println(result);
        }
    }

    @Test
    public void name() throws Exception {
        Scanner in = new Scanner(System.in);
        String[] res;
        int size;
        size = Integer.parseInt(in.nextLine().trim());
    }
}