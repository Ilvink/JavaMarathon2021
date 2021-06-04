package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Players p1 = new Players(random.nextInt(10)+90);
        Players p2 = new Players(random.nextInt(10)+90);
        Players p3 = new Players(random.nextInt(10)+90);
        Players p4 = new Players(random.nextInt(10)+90);
        Players p5 = new Players(random.nextInt(10)+90);
        Players p6 = new Players(random.nextInt(10)+90);
        Players.info();

        for (int i = 0; i < p2.getStamina(); i--) {
            p2.run();
            System.out.println(p2.getStamina());
        }

    }
}
