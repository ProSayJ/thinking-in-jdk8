package prosayj.thinking.jdk8.examples.chapter4;

import prosayj.thinking.jdk8.support.SampleData;
import org.junit.Test;

public class PrimitivesTest {

    @Test
    public void albumStatistics() {
        Primitives.printTrackLengthStatistics(SampleData.A_LOVE_SUPREME);
    }

}
