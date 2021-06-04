package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel ;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void getInfo(){
        System.out.println("Producer: " + producer + ", year of issue: " + year+ ", length: " + length + ", weight: " + weight + ", fuel: " + fuel);
    }

    public void fuelUp(int n){
        fuel +=  n;

    }

    public int getLength() {
        return length;
    }

    public static void  compareAirplanes(Airplane a1, Airplane a2){
        if(a1.getLength()> a2.getLength()){
            System.out.println("First airplane is longer than the second");
        }else if(a1.getLength()< a2.getLength()){
            System.out.println("Second airplane is longer than the first");}
        else
            System.out.println("Both airplane length are equal");
    }
}
