package prosayj.thinking.jdk8.answers.chapter5;

import prosayj.thinking.jdk8.examples.chapter1.Artist;
import prosayj.thinking.jdk8.examples.chapter1.SampleData;
import prosayj.thinking.jdk8.answers.chapter5.LongestName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestNameTest {

    @Test
    public void findsLongestNameByReduce() {
        Artist artist = LongestName.byReduce(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

    @Test
    public void findsLongestNameByCollecting() {
        Artist artist = LongestName.byCollecting(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

}
