package day11.task2;

public class Paladin extends Hero implements Healer,PhysAttack{

    public static final int HEALTH_AMOUNT= 25;
    public static final int HEALTH_TEAMMATE_AMOUNT= 10;


   public Paladin(){
       physDef = 0.5;
       magicDef = 0.2;
       physDam = 15;

   }


    @Override
    public void healHimself() {
       if(health +HEALTH_AMOUNT > MAX_HEALTH){
           health = MAX_HEALTH;
       }else{
           health+= 25;
       }

    }

    @Override
    public void healTeammate(Hero hero) {
       if(hero.health + HEALTH_TEAMMATE_AMOUNT > MAX_HEALTH){
           hero.health = MAX_HEALTH;
       } else {
           hero.health += 10;
       }


    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
