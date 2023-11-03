package bookChallange;

public class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;


    public Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre + ", Year: " + year + ", Times player: " + timesPlayed + "//  ";
    }
// Practice for you! Create a constructor, all the getters and a toString()
}

