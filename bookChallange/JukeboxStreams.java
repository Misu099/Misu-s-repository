package bookChallange;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JukeboxStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();
        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);

        List<Song> byBeatles = songs.stream()
                .filter(song -> song.getArtist().equals("The Beatles"))
                .collect(Collectors.toList());
        System.out.println(byBeatles);

        List<Song> newerThan1995 = songs.stream()
                .filter(song -> song.getYear() > 1995)
                .collect(Collectors.toList());
        System.out.println(newerThan1995);

        List<Song> mostPlayed = songs.stream()
                .sorted((s1, s2) -> s2.getTimesPlayed() - s1.getTimesPlayed())
                .collect(Collectors.toList());
        System.out.println(mostPlayed);

        List<Song> startsWithH = songs.stream()
                .filter(song -> song.getTitle().charAt(0) == 'H')
                .collect(Collectors.toList());
        System.out.println(startsWithH);


        Set<String> genres = songs.stream()
                .map(song -> song.getGenre())
                .collect(Collectors.toSet());
        System.out.println(genres);


    }

}
