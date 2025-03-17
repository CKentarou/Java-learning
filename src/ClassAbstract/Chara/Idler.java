package ClassAbstract.Chara;

public class Idler extends Chara{
    public Idler(String name) {
        super(name);
    }

    public void idle() {
        System.out.println("何もしないでダラダラ");
    }

    @Override
    public void special(Chara c) {
        this.idle();
    }
}
