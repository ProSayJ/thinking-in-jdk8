package prosayj.thinking.jdk8.examples.chapter3;

import prosayj.thinking.jdk8.support.SampleData;
import org.junit.Test;

public class IterationTest {

    @Test
    public void lazyPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.filterArtistsFromLondonPrinted(SampleData.MEMBERS_OF_THE_BEATLES);
    }

    @Test
    public void evaluatedPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.internalCountArtistsFromLondonPrinted(SampleData.MEMBERS_OF_THE_BEATLES);
    }
}
