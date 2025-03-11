package ClassInheritance.Human02;

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

    //final修飾子をつけることで、オーバーライドを禁止することができる。
    public final void print() {
        System.out.println(this);
    }
}
