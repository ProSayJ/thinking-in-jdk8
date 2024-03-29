package prosayj.thinking.jdk8.examples.chapter4;


import prosayj.thinking.jdk8.support.Album;

import java.util.List;

public abstract class Order {

    protected final List<Album> albums;

    public Order(List<Album> albums) {
        this.albums = albums;
    }

    public abstract long countRunningTime();

    public abstract long countMusicians();

    public abstract long countTracks();

}
