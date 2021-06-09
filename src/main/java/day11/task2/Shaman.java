package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack, Healer{
    public static final int HEALTH_AMOUNT= 50;
    public static final int HEALTH_TEAMMATE_AMOUNT= 30;

    public Shaman(){
     physDef = 0.2;
     magicDef = 0.2;
     magicDam = 10;
     physDam = 15;
 }
    @Override
    public void healHimself() {
     if(health + HEALTH_AMOUNT > MAX_HEALTH){
         health = MAX_HEALTH;
     }else{
         health += 50;
     }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + HEALTH_TEAMMATE_AMOUNT > MAX_HEALTH){
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 30;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore =magicDam * (1 - hero.magicDef);
        if(hero.health -attackScore < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else{
            hero.health -=attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
