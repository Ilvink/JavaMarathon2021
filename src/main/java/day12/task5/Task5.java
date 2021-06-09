package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Damon Albah",25));
        members1.add(new MusicArtist("Jamie Hewlett",20));
        members1.add(new MusicArtist("Remi Kabaka Jr.",17));
        members1.add(new MusicArtist("Russel Hobbs",22));


      MusicBand musicBand1 = new MusicBand("Gorillaz", 1998, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Freddie Mercury",30));
        members2.add(new MusicArtist("Brian May",25));
        members2.add(new MusicArtist("Roger Taylor",24));
        members2.add(new MusicArtist("John Deacon",27));


        MusicBand musicBand2 = new MusicBand("Queen", 1970, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}
