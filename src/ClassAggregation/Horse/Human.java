package ClassAggregation.Horse;

public class Human {
    private String name;
    public Human(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "人間の" + this.getName() + "です";
    }
    public void print() {
        System.out.println(this);
    }
}
