package ClassAbstract.Sandwich;

public class Main {
    public static void main(String args[]) {
        Sandwich[] sa = new Sandwich[3];

        sa[0] = new HamSand(new Bread(), new Ham[]{new Ham(), new Ham()});
        sa[1] = new EggSand(new Bread(), new Egg());

        Ingredient[] i = new Ingredient[]{new Ham(), new Egg(), new Cheese(), new Lettuce(), new Cutlet()};

        sa[2] = new MixSand(new Bread(), i);

        for (Sandwich s : sa) {
            s.print();
            s.recipe();
        }
    }
}
