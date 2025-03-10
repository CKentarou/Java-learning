package Chara1;
import java.util.Random;

public class BattleRoyal {
    public static void main(String[] args) {
        Chara[] c = new Chara[]{
                new Chara("伊藤", 100),
                new Chara("佐藤", 110),
                new Chara("狩野", 120),
                new Chara("坂本", 110)
        };

        int counter = 0;
        Chara[] alive;
        Random r = new Random();

        while(true) {
            int aliveCount = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i].isAlive()) {
                    aliveCount += 1;
                }
            }

            alive = new Chara[aliveCount];
            for (int i = 0, j = 0; i < c.length; i++) {
                if (c[i].isAlive()) {
                    alive[j] = c[i];
                    j += 1;
                }
            }

            if (aliveCount <= 1) {
                break;
            }

            counter+=1;

            for (int i = 1; i < 100; i++) {
                int m = r.nextInt(aliveCount);
                int n = r.nextInt(aliveCount);
                Chara temp = alive[m];
                alive[m] = alive[n];
                alive[n] = temp;
            }

            int dice = r.nextInt(100);
            if (dice < 20) {
                alive[0].play();
            } else if (dice < 40) {
                alive[0].rest();
            } else {
                alive[0].attack(alive[1]);
            }
        }
        System.out.println("対戦回数は" + counter);
        alive[0].print();
        System.out.println("勝者は" + alive[0].getName());
    }
}
