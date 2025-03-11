package ClassBasics.Robot;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void attack(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("ミサイル発射！！");
        }
    }

    public int calclate(int a, int b) {
        return a + b;
    }
}
