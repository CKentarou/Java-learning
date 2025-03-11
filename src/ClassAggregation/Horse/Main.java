package ClassAggregation.Horse;

public class Main {
    public static void main(String[] args) {
        Horse deepImpact = new Horse();
        deepImpact.print();

        Human[] humans = new Human[]{
                new Samurai("桃太郎"),
                new Jockey("武豊")
        };

        deepImpact.ride(humans[0]);
        deepImpact.print();
        deepImpact.ride(humans[1]);
        deepImpact.print();
        humans[1].print();
        humans[0].print();

    }
}
