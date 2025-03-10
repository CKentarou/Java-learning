package Chara1;

public class BattleOf2Charactors {
    public static void main(String[] args) {
        Chara[] charas = new Chara[2];

        charas[0] = new Chara("田中", 100);
        charas[1] = new Chara("山本", 120);

        charas[0].attack(charas[1]);

        while (charas[0].getHP() > 0 && charas[1].getHP() > 0) {
            charas[0].attack(charas[1]);
            charas[1].print();
            charas[1].attack(charas[0]);
            charas[0].print();
        }

        if (charas[0].getHP() > 0) {
            System.out.print(charas[0].getName() + "の勝ち");
        } else if (charas[1].getHP() > 0) {
            System.out.print(charas[1].getName() + "の勝ち");
        } else {
            System.out.print("引き分け");
        }
    }
}
