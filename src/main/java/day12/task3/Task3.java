package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Gorillaz", 1998));
        musicBands.add(new MusicBand("Queen", 1970));
        musicBands.add(new MusicBand("Bloodhound Gang", 1992));
        musicBands.add(new MusicBand("30 seconds to mars", 1998));
        musicBands.add(new MusicBand("Muse", 1994));
        musicBands.add(new MusicBand("Nirvana", 1987));
        musicBands.add(new MusicBand("Звери", 2001));
        musicBands.add(new MusicBand("Amatory", 2001));
        musicBands.add(new MusicBand("Краски", 2001));
        musicBands.add(new MusicBand("Чили", 2005));
        musicBands.add(new MusicBand("Время и Стекло", 2010));
        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band: musicBands) {
            if (band.getYear()>2000){
                musicBandsAfter2000.add(band);
            }
        }
        System.out.println(musicBandsAfter2000);
    }

}

