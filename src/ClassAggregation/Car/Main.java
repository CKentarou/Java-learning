package ClassAggregation.Car;
import ClassInheritance.Human02.Esper;
import ClassInheritance.Human02.Human;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("山本");
        Car c = new Car();
        c.rideIn(h);
        c.print();
        c.getOut();
        c.print();
        //EsperクラスもHumanを継承しているため車に乗れる
        c.rideIn(new Esper("エスパン"));
        c.print();
    }
}
