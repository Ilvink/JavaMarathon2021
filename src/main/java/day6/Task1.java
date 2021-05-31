package day6;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       Car audi = new Car();
        audi.setYear(2005);
        audi.setModel("a7");
        audi.setColor("Blue");

       Motobike yamaha = new Motobike(2010, "Red", " Yamaha r6");

       audi.getInfo();
       yamaha.getInfo();

        System.out.println(audi.yearDifference(2020));
        System.out.println(yamaha.yearDifference(2020));



    }
}
