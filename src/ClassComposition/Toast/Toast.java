package ClassComposition.Toast;

public class Toast {
    Bread bread;
    Butter butter;

    public Toast(Bread bread, Butter butter) {
        this.bread = bread;
        this.butter = butter;
    }

    public String toString() {
        return butter.toString() + bread.toString();
    }

    public void print() {
        System.out.println(this+"です");
    }
}
