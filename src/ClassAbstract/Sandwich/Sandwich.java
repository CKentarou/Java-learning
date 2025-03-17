package ClassAbstract.Sandwich;

public abstract class Sandwich {
    Bread bread;
    Ingredient[] ingredient;

    public Sandwich(Bread b, Ingredient[] i) {
        bread = b;
        ingredient = i;
    }

    public void print() {
        bread.print();
        for (int i = 0; i < ingredient.length; i++) {
            ingredient[i].print();
        }
        bread.print();
    }

    public abstract void recipe();
}
