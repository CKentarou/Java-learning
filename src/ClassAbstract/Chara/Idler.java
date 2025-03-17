package ClassAbstract.Chara;

public class Idler extends Chara{
    public Idler(String name, int hp) {
        super(name, hp);
    }

    public void idle() {
        System.out.println("何もしないでダラダラ");
    }

    @Override
    public void special(Chara c) {
        this.idle();
    }
}
