package ClassAbstract.Sandwich;

public class MixSand extends Sandwich{
    Bread bread;
    Ingredient[] ingredients;

    public MixSand(Bread b, Ingredient[] i) { super(b, i); }

    @Override
    public void recipe() {
        System.out.println("冷蔵庫にあるものを選んで君だけのオリジナルサンドウィッチを作ろう。");
    }
}
