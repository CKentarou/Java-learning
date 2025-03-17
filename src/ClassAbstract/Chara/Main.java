package ClassAbstract.Chara;
import static ClassAbstract.Chara.Chara.*;

public class Main {
    public static void main(String[] args) {
        Chara[] ca = new Chara[3];
        ca[0] = new Idler("アイドラー");
        ca[1] = new Fighter("ファイター");
        ca[2] = new Magician("マジシャン");

        ca[0].special(ca[1]);
        ca[1].special(ca[2]);
        ca[2].special(ca[0]);

        for (Chara c : ca) {
            c.print();
            c.chohatsu();
        }

        while (ca[1].isAlive() || ca[2].isAlive()) {
            ca[1].special(ca[2]);
            ca[1].chohatsu();
            ca[2].special(ca[1]);
            ca[2].chohatsu();
        }
    }
}
