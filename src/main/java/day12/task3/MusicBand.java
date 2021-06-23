package day12.task3;

import day12.task5.MusicArtist;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicBand> bands;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return name + ", " + year;
    }

    public static void musicBandsAfter2000(List<MusicBand> musicBands) {
        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000) {
                musicBands.add(band);
            }
        }
        System.out.println(musicBands);
    }
}
