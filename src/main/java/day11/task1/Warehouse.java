package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString(){
        return " Count picked orders: " + countPickedOrders + " ,count delivered orders: " + countDeliveredOrders;

    }
    public void incrementPickedOrders(){
        countPickedOrders++;
    }
    public void incrementDeliveredOrders(){
        countDeliveredOrders++;
    }

}
