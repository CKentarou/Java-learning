package ClassInheritance.Chara02;

public class Magician extends Chara {
    public Magician(String name) {
        super(name);
    }

    public void magic(Chara target) {
        int times = (int)(Math.random() * 4) + 1;
        for (int i = 0; i < times; i++) {
            this.attack(target);
        }
        this.damage();
    }
}
