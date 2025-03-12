package ClassComposition.EggToast;

import ClassComposition.Toast.Bread;
import ClassComposition.Toast.Butter;

public class Main {
    public static void main(String[] args) {
        Egg egg = new Egg();
        Bread bread = new Bread();
        Butter butter = new Butter();

        EggToast eggToast = new EggToast(bread, butter, egg);

        eggToast.print();
    }
}
