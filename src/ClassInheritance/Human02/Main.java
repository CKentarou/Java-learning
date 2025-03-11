package ClassInheritance.Human02;

public class Main {
    public static void main(String[] args) {
        //エスパーの継承を確認
        Human h = new Human("佐藤");
        Esper e = new Esper("エスパン");

        h.print();
        e.special();
        e.print();
    }
}
