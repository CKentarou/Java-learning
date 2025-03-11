package ClassAggregation.Horse;

public class Horse {
    private Human rider;
    public Horse() {
        this.rider = null;
    }

    public void ride(Human rider) {
        this.rider = rider;
    }

    public Human dismount() {
        Human temp = rider;
        rider = null;
        return temp;
    }

    public void print() {
        if (this.rider != null) {
            this.rider.print();
        }
        System.out.println("ヒヒーン！");
    }
}
