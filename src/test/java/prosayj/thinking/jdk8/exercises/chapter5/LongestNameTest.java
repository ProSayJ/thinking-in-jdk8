package prosayj.thinking.jdk8.exercises.chapter5;

import org.junit.Test;
import prosayj.thinking.jdk8.examples.chapter1.Artist;
import prosayj.thinking.jdk8.examples.chapter1.SampleData;

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
