package prosayj.thinking.jdk8.exercises.chapter4;

import prosayj.thinking.jdk8.support.Artist;
import prosayj.thinking.jdk8.support.SampleData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

public class PerformanceTest {

    @Test
    public void findsAllTheBeatles() {
        PerformanceFixed stub = new PerformanceFixed() {
            @Override
            public String getName() {
                throw new UnsupportedOperationException();
            }

            @Override
            public Stream<Artist> getMusicians() {
                return Stream.of(SampleData.THE_BEATLES);
            }
        };

        List<Artist> allMusicians = stub.getAllMusicians().collect(toList());
        assertThat(allMusicians, hasItem(SampleData.THE_BEATLES));
        // There really must be a better way than this
        assertThat(allMusicians, hasItems(SampleData.MEMBERS_OF_THE_BEATLES.toArray(new Artist[0])));
    }

}
