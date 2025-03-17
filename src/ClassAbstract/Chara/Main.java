package ClassAbstract.Chara;

public class Main {
    public static void main(String[] args) {
        Chara[] ca = new Chara[3];
        ca[0] = new Idler("アイドラー", 100);
        ca[1] = new Fighter("ファイター", 100);
        ca[2] = new Magician("マジシャン", 100);

        ca[0].special(ca[1]);
        ca[1].special(ca[2]);
        ca[2].special(ca[0]);

        for (Chara c : ca) {
            c.print();
        }
    }
}
