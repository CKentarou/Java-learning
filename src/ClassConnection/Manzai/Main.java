package ClassConnection.Manzai;

public class Main {
    public static void main(String[] args) {
        Boke machan = new Boke();
        Tukkomi hamachan = new Tukkomi();
        hamachan.print();
        machan.print();

        machan.bokeru();
        hamachan.tukkomu();

        hamachan.tukkomu(machan);
        machan.bokeru(hamachan);
    }
}
