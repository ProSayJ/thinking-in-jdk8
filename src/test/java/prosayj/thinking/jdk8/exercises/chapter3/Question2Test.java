package prosayj.thinking.jdk8.exercises.chapter3;

import org.junit.Test;
import prosayj.thinking.jdk8.examples.chapter1.SampleData;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class Question2Test {

    @Test
    public void internal() {
        assertEquals(4, Question2.countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

}
