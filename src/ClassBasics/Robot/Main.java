package ClassBasics.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("ドラえもん");
        robot.attack(5);
        System.out.print(robot.calclate(10, 20 ));
    }
}
