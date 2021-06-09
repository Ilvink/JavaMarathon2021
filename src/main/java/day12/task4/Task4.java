package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Damon Albah");
        members1.add("Jamie Hewlett");
        members1.add("Remi Kabaka Jr.");
        members1.add("Russel Hobbs");


        MusicBand musicBand1 = new MusicBand("Gorillaz", 1998, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Freddie Mercury");
        members2.add("Brian May");
        members2.add("Roger Taylor");
        members2.add("John Deacon");

        MusicBand musicBand2 = new MusicBand("Queen", 1970, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
