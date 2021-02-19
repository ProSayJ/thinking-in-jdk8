package prosayj.thinking.jdk8.examples.chapter1;

import org.junit.Assert;
import org.junit.Test;
import prosayj.thinking.jdk8.support.Album;
import prosayj.thinking.jdk8.support.Artist;
import prosayj.thinking.jdk8.support.SampleData;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static prosayj.thinking.jdk8.support.SampleData.THE_BEATLES;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toSet;

public class TestPerformance {

    @Test
    public void allMembers() {
        //专辑
        Album album = new Album("foo", Collections.emptyList(), singletonList(THE_BEATLES));

        Set<Artist> musicians = album.getAllMusicians().collect(toSet());
        Set<Artist> expectedMusicians = new HashSet<>(SampleData.MEMBERS_OF_THE_BEATLES);
        expectedMusicians.add(THE_BEATLES);
        Assert.assertEquals(expectedMusicians, musicians);
    }

}
