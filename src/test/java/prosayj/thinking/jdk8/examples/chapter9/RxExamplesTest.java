package prosayj.thinking.jdk8.examples.chapter9;

import prosayj.thinking.jdk8.support.Artist;
import prosayj.thinking.jdk8.support.SampleData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RxExamplesTest {

    @Test
    public void filtersAlbums() throws InterruptedException {
        RxExamples examples = new RxExamples(SampleData.getThreeArtists());
        Artist artist = examples.search("John", "UK", 5)
                                .toBlockingObservable()
                                .single();

        assertEquals(SampleData.JOHN_LENNON, artist);
    }

}
