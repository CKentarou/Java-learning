package ClassAbstract.Chara;

public class Fighter extends Chara{
    public Fighter(String name) {
        super(name);
    }

    public void chop(Chara c) {
        this.attack(c);
        this.attack(c);
    }

    @Override
    public void special(Chara c) {
        this.chop(c);
    }
}
