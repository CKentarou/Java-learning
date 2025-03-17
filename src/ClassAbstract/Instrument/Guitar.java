package ClassAbstract.Instrument;

public class Guitar extends Instrument{
    public Guitar() { super(); }

    public void print() {
        System.out.println("ギターです。");
    }

    @Override
    public void sound() {
        System.out.println("ジャラーン");
    }
}
