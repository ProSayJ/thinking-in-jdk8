package prosayj.thinking.jdk8.examples.chapter4;

import prosayj.thinking.jdk8.examples.chapter1.SampleData;
import org.junit.Test;
import prosayj.thinking.jdk8.examples.chapter4.Primitives;

public class PrimitivesTest {

    @Test
    public void albumStatistics() {
        Primitives.printTrackLengthStatistics(SampleData.aLoveSupreme);
    }

}
