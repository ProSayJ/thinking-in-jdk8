package prosayj.thinking.jdk8.examples.chapter9;


import prosayj.thinking.jdk8.support.Album;
import prosayj.thinking.jdk8.support.Artist;
import prosayj.thinking.jdk8.support.SampleData;
import prosayj.thinking.jdk8.support.Track;
import org.junit.Test;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class AlbumLookupTest {

    interface AlbumLookupFactory extends BiFunction<List<Track>, List<Artist>, AlbumLookup> {

    }

    @Test
    public void albumLookedUp() {
        Album album = SampleData.A_LOVE_SUPREME;
        List<Track> trackList = album.getTrackList();
        List<Artist> musicianList = album.getMusicianList();

        AlbumLookupFactory completable = CompletableAlbumLookup::new;
        AlbumLookupFactory future = FutureAlbumLookup::new;

        Stream.of(completable, future)
              .forEach(factory -> {
 AlbumLookup lookup = factory.apply(trackList, musicianList);
                  System.out.println("Testing: " + lookup.getClass().getSimpleName());
                  Album result = lookup.lookupByName(album.getName());

                  assertEquals(trackList, result.getTrackList());
                  assertEquals(musicianList, result.getMusicianList());
              });
    }

}
