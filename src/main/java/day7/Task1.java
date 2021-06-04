package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("America", 1980, 400, 79);
        Airplane boeing2 = new Airplane("America", 1980, 400, 79);
        Airplane.compareAirplanes(boeing, boeing2);

    }
}