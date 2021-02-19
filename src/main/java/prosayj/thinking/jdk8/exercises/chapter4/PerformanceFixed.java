package prosayj.thinking.jdk8.exercises.chapter4;

import prosayj.thinking.jdk8.examples.chapter1.Artist;
import prosayj.thinking.jdk8.exercises.Exercises;

import java.util.stream.Stream;

/** A Performance by some musicians - eg an Album or Gig. */
public interface PerformanceFixed {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicians() {
        return Exercises.replaceThisWithSolution();
    }

}
