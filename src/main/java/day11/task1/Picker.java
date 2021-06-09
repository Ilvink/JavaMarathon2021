package day11.task1;

public class Picker implements Worker{
    private int salary;
    private static final int SALARY = 80;
    private boolean isPayed;
    private Warehouse w;

    public Picker(Warehouse w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Salary: " + salary + " , is payed " + isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {

        return isPayed;
    }

    @Override
    public void doWork() {
        w.incrementPickedOrders();
        salary+= SALARY;


    }

    @Override
    public void bonus() {
        if(w.getCountPickedOrders()<10000){
            System.out.println("Bonus not available ");
            return;
        }else if(isPayed){
            System.out.println("Bonus is payed");
            return;
        }
            salary += 70000;
        isPayed = true;

    }
}
