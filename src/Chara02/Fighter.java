package Chara02;

public class Fighter extends Chara {
    public Fighter(String name) {
        super(name);
    }

    public void chop(Chara target) {
        this.attack(target);
        this.attack(target);
    }
}
