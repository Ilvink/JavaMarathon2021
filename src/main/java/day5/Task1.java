package day5;

public class Task1 {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.setYear(2005);
        bmw.setModel("x5");
        bmw.setColor("Blue");
        System.out.println(bmw.getModel() + " " + bmw.getColor() + " " + bmw.getYear() );


    }
}
