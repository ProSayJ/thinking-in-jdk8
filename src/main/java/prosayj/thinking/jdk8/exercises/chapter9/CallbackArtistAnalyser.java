package prosayj.thinking.jdk8.exercises.chapter9;

import prosayj.thinking.jdk8.examples.chapter1.Artist;
import prosayj.thinking.jdk8.exercises.Exercises;

import java.util.function.Consumer;
import java.util.function.Function;

public class CallbackArtistAnalyser implements ArtistAnalyzer {

    private final Function<String, Artist> artistLookupService;

    public CallbackArtistAnalyser(Function<String, Artist> artistLookupService) {
        this.artistLookupService = artistLookupService;
    }

    public void isLargerGroup(String artistName, String otherArtistName, Consumer<Boolean> handler) {
        Exercises.replaceThisWithSolution();
    }

    private long getNumberOfMembers(String artistName) {
        return Exercises.replaceThisWithSolution();
    }

}