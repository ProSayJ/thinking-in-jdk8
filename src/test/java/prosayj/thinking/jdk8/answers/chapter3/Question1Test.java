package prosayj.thinking.jdk8.answers.chapter3;

import prosayj.thinking.jdk8.support.Album;
import prosayj.thinking.jdk8.support.SampleData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static prosayj.thinking.jdk8.support.SampleData.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Question1Test {

    @Test
    public void addsEmptyList() {
        int result = Question1.addUp(Stream.empty());
        assertEquals(0, result);
    }

    @Test
    public void addsListWithValues() {
        int result = Question1.addUp(Stream.of(1, 3, -2));
        assertEquals(2, result);
    }

    @Test
    public void extractsNamesAndOriginsOfArtists() {
        List<String> namesAndOrigins = Question1.getNamesAndOrigins(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    public void findsShortAlbums() {
        List<Album> input = asList(MANY_TRACK_ALBUM, SAMPLE_SHORT_ALBUM, A_LOVE_SUPREME);
        List<Album> result = Question1.getAlbumsWithAtMostThreeTracks(input);
        assertEquals(asList(SAMPLE_SHORT_ALBUM, A_LOVE_SUPREME), result);
    }

}
