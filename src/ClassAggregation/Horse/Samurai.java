package ClassAggregation.Horse;

public class Samurai extends Human {
    public Samurai(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "侍の" + this.getName() + "だ！！";
    }

    public void Slash() {
        System.out.println("居合い抜き！！");
    }
}
