package prosayj.thinking.jdk8.examples.chapter3;

import prosayj.thinking.jdk8.support.Album;
import prosayj.thinking.jdk8.support.SampleData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RefactorTest {

    @Test
    public void allStringJoins() {
        List<Supplier<Refactor.LongTrackFinder>> finders = Arrays.<Supplier<Refactor.LongTrackFinder>>asList(
            Refactor.Step0::new,
            Refactor.Step1::new,
            Refactor.Step2::new,
            Refactor.Step3::new,
            Refactor.Step4::new
        );

        List<Album> albums = unmodifiableList(asList(SampleData.A_LOVE_SUPREME, SampleData.SAMPLE_SHORT_ALBUM));
        List<Album> noTracks = unmodifiableList(asList(SampleData.SAMPLE_SHORT_ALBUM));

        finders.forEach(finder -> {
            System.out.println("Testing: " + finder.toString());

            Refactor.LongTrackFinder longTrackFinder = finder.get();
            Set<String> longTracks = longTrackFinder.findLongTracks(albums);

            assertEquals("[Acknowledgement, Resolution]", longTracks.toString());

            longTracks = longTrackFinder.findLongTracks(noTracks);

            assertTrue(longTracks.isEmpty());
        });
    }

}
