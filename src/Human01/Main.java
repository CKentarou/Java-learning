package Human01;

public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[]{
                new Human("山本", 20),
                new Human("田中", 22),
                new Human("佐藤", 19)
        };

        for (Human human : humans) {
            human.print();
        }

    }
}
