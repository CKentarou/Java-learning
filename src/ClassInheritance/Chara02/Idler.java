package ClassInheritance.Chara02;

public class Idler extends Chara {
    public Idler(String name) {
        super(name);
    }

    public void idle() {
        System.out.println("ダラダラする〜");
    }
}
