package day7;

public class Players {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Players(int stamina) {
        this.stamina = stamina;
        if(countPlayers< 6)
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if (stamina == 0){
            return;}
        stamina--;

        if (stamina == 0)
            countPlayers--;
    }
    public static void info(){
        if(countPlayers<6){
            System.out.println("The team are incomplete. There are still " + (6-countPlayers)+" free places on the steel ");
        }else{
            System.out.println("There are no empty seats on the field");
        }

    }

}
