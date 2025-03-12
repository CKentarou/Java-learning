package ClassComposition.Toast;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Butter butter = new Butter();
        Toast toast1 = new Toast(bread, butter);
        toast1.print();

        Toast toast2 = new Toast(new Bread(), new Butter());
        toast2.print();
    }
}
