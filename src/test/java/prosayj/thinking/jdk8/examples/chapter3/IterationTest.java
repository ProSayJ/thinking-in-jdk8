package prosayj.thinking.jdk8.examples.chapter3;

import prosayj.thinking.jdk8.examples.chapter1.SampleData;
import org.junit.Test;
import prosayj.thinking.jdk8.examples.chapter3.Iteration;

public class IterationTest {

    @Test
    public void lazyPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.filterArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }

    @Test
    public void evaluatedPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.internalCountArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }
}
