package Chara02;

public class Main {
    public static void main(String[] args) {
        Idler i = new Idler("遊び人");
        Fighter f = new Fighter("ファイター");
        Magician m = new Magician("マジシャン");

        f.chop(m);
        m.magic(f);
        f.chop(i);
        m.magic(i);
        i.idle();

        i.print();
        f.print();
        m.print();
    }
}
