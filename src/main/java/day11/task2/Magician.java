package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{
 public Magician(){
     magicDef = 0.8;
     physDam = 5;
     magicDam = 20;

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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
