package prosayj.thinking.jdk8.answers.chapter4;

import prosayj.thinking.jdk8.support.Artist;

import java.util.stream.Stream;

/** A Performance by some musicians - e.g., an Album or Gig. */
public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

}