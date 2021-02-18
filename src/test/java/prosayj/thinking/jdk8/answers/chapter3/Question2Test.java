package prosayj.thinking.jdk8.answers.chapter3;

import org.junit.Test;
import prosayj.thinking.jdk8.examples.chapter1.SampleData;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static prosayj.thinking.jdk8.answers.chapter3.Question2.countBandMembersInternal;


public class Question2Test {

    @Test
    public void internal() {
        assertEquals(4, countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

}
