package ClassAbstract.Instrument;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.print();

        Piano piano = new Piano();
        piano.print();

//        Instrument instrument = new Instrument();

        Instrument[] ia = {null, new Piano()};
        for (Instrument i : ia) {
            if (i != null) {
                i.print();
                i.sound();
            }
        }
    }
}
