package ClassAbstract.Sandwich;

public class EggSand extends Sandwich{
    Bread bread;
    Egg egg;

    public EggSand(Bread b, Egg[] e) { super(b, e); }
    public EggSand(Bread b, Egg e) { super(b, new Egg[]{e}); }


    @Override
    public void recipe() {
        System.out.println("国産ハーブ鶏の初卵と国産ミルクから作った新鮮バターで仕上げたオムレツをトーストにはさむ。");
    }
}
