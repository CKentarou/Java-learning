package Human02;

public class Esper extends Human {
    public Esper(String name) {
        super(name);
    }

    public void special() {
        System.out.println("超能力");
    }

    @Override//アノテーション（システムにどのような処理かを伝える記述（？））
    public String toString() {
        return "エスパーの" +this.getName() + "です";
    }
}
