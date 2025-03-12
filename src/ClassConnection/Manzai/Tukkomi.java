package ClassConnection.Manzai;

public class Tukkomi {
    public Tukkomi() {}

    public void tukkomu() {
        System.out.println("なんでやねん！");
    }

    public void tukkomu(Boke b) {
        b.bokeru();
        this.tukkomu();
    }

    public void print() {
        System.out.println("私はツッコミです。");
    }
}
