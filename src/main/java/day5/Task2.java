package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike yamaha = new Motobike(2010, "Red", " Yamaha r6");
        System.out.println("You bought " + yamaha.getColor() + " " + yamaha.getModel() + ", " + yamaha.getYear() +  " year of issue");
    }
}
