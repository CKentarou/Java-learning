package ClassAbstract.Chara;

public class Magician extends Chara{
    public Magician(String name) {
        super(name);
    }

    public void magic(Chara c) {
        int cnt = (int)(Math.random() * 5.0);
        for (int i = 0; i < cnt; i++) {
            this.attack(c);
        }
        this.damage();
    }

    @Override
    public void special(Chara c) {
        this.magic(c);
    }
}
