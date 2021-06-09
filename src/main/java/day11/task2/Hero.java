package day11.task2;

public abstract class Hero implements PhysAttack{
    final int MIN_HEALTH = 0;
    final  int MAX_HEALTH = 100;
    int health;
    int physDam;
    int magicDam;
    double physDef;
    double magicDef;

    public Hero(){
        this.health = 100;
    }

    public void physicalAttack(Hero hero){
        double attackScore =physDam * (1 - hero.physDef);
        if(hero.health -attackScore < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else{
            hero.health -=attackScore;
        }

    }
}
