package ClassAbstract.Instrument;

public abstract class Instrument {
    public Instrument() {}
    public void print() {
        System.out.println("楽器です。");
    }
    public abstract void sound();
}
