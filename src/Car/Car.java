package Car;
import Human02.Human;

public class Car {
    private Human driver;

    public Car() {
        Human driver = null;
    }

    public void rideIn(Human driver) {
        if (this.driver == null) {
            this.driver = driver;
        }
    }

    public Human getOut() {
        Human h = this.driver;
        this.driver = null;
        return h;
    }

    public void print() {
        if (this.driver != null) {
            System.out.print(this.driver.getName()+"が乗っている");
        }
        System.out.println("車です。");
    }
}
