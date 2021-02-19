package prosayj.thinking.jdk8.answers.chapter9;

import prosayj.thinking.jdk8.support.Artist;
import prosayj.thinking.jdk8.support.SampleData;

public class FakeLookupService {

    public Artist lookupArtistName(String name) {
        sleepToSimulateLookupLatency();

        switch (name) {
            case "The Beatles":
                return SampleData.THE_BEATLES;

            case "John Coltrane":
                return SampleData.JOHN_COLTRANE;

            default:
                throw new IllegalArgumentException("Unknown artist: " + name);
        }
    }

    private void sleepToSimulateLookupLatency() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
