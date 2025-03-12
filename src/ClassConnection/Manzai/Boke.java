package ClassConnection.Manzai;

public class Boke {
    public Boke() {}

    public void bokeru() {
        System.out.println("これからは俺がツッコミや！！");
    }

    public void bokeru(Tukkomi t) {
        this.bokeru();
        t.tukkomu();
    }

    public void print() {
        System.out.println("私はボケです。");
    }
}
