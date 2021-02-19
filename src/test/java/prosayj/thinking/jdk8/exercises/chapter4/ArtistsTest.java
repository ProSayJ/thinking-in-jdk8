package prosayj.thinking.jdk8.exercises.chapter4;

import prosayj.thinking.jdk8.examples.chapter1.Artist;
import prosayj.thinking.jdk8.examples.chapter1.SampleData;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ArtistsTest {

    private final Artists optionalExamples = new Artists(SampleData.getThreeArtists());

    @Test
    public void indexWithinRange() {
        Artist artist = optionalExamples.getArtist(0);
        assertNotNull(artist);
    }

    @Test(expected = IllegalArgumentException.class)
    public void indexOutsideRange() {
        optionalExamples.getArtist(4);
    }

    @Test
    public void nameIndexInsideRange() {
        String artist = optionalExamples.getArtistName(0);
        assertEquals("John Coltrane", artist);
    }

    @Test
    public void nameIndexOutsideRange() {
        String artist = optionalExamples.getArtistName(4);
        assertEquals("unknown", artist);
    }

}
