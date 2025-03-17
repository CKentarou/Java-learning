package ClassAbstract.Instrument;

public class Piano extends Instrument{
    public Piano() { super(); }
    public void print() {
        System.out.println("ピアノです。");
    }

    @Override
    public void sound() {
        System.out.println("ピローん");
    }
}
