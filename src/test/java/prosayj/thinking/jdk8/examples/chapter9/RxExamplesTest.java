package prosayj.thinking.jdk8.examples.chapter9;

import prosayj.thinking.jdk8.examples.chapter1.Artist;
import prosayj.thinking.jdk8.examples.chapter1.SampleData;
import org.junit.Test;
import prosayj.thinking.jdk8.examples.chapter9.RxExamples;

import static org.junit.Assert.assertEquals;

public class RxExamplesTest {

    @Test
    public void filtersAlbums() throws InterruptedException {
        RxExamples examples = new RxExamples(SampleData.getThreeArtists());
        Artist artist = examples.search("John", "UK", 5)
                                .toBlockingObservable()
                                .single();

        assertEquals(SampleData.johnLennon, artist);
    }

}
