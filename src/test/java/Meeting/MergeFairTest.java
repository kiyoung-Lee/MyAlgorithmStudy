package Meeting;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MergeFairTest {

    private MergeFair solution;

    @Before
    public void setUp(){
        solution = new MergeFair();
    }

    @Test
    public void sample_Test() throws Exception {
        List<MergeFair.Pair> pairList = getPairList();
        List<MergeFair.Pair> result = solution.solution(pairList);

        for(MergeFair.Pair pair : result){
            System.out.println(pair.start + "," + pair.end);
        }
    }

    private List<MergeFair.Pair> getPairList(){
        MergeFair.Pair addPair1 = new MergeFair.Pair();
        addPair1.start = 1;
        addPair1.end = 3;
        MergeFair.Pair addPair2 = new MergeFair.Pair();
        addPair2.start = 2;
        addPair2.end = 4;
        MergeFair.Pair addPair3 = new MergeFair.Pair();
        addPair3.start = 6;
        addPair3.end = 7;
        MergeFair.Pair addPair4 = new MergeFair.Pair();
        addPair4.start = 7;
        addPair4.end = 9;
        MergeFair.Pair addPair5 = new MergeFair.Pair();
        addPair5.start = 10;
        addPair5.end = 12;
        MergeFair.Pair addPair6 = new MergeFair.Pair();
        addPair6.start = 11;
        addPair6.end = 14;
        MergeFair.Pair addPair7 = new MergeFair.Pair();
        addPair7.start = 13;
        addPair7.end = 16;

        List<MergeFair.Pair> pairList = new ArrayList<>();
        pairList.add(addPair1);
        pairList.add(addPair2);
        pairList.add(addPair3);
        pairList.add(addPair4);
        pairList.add(addPair5);
        pairList.add(addPair6);
        pairList.add(addPair7);

        return pairList;
    }
}