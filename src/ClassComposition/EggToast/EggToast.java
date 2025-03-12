package ClassComposition.EggToast;

import ClassComposition.Toast.*;

public class EggToast extends Toast {
    Egg egg;
    public EggToast(Bread bread, Butter butter, Egg egg) {
        super(bread, butter);
        this.egg = egg;
    }

    @Override
    public String toString() {
        return egg.toString() + super.toString();
    }
}
