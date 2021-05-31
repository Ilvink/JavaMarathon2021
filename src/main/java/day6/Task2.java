package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("America", 1980, 40, 79);
       boeing.setYear(1990);
       boeing.setLength(500);
        boeing.fuelUp(8000);
        boeing.fuelUp(2000);
        boeing.getInfo();

    }
}
