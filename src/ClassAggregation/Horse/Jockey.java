package ClassAggregation.Horse;

public class Jockey extends Human {
    public Jockey(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "騎手の" + this.getName();
    }

    public void WillWhip() {
        System.out.println("ムチ-パチン！！");
    }
}
