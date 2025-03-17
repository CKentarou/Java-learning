package ClassAbstract.Sandwich;

public class HamSand extends Sandwich{
    Bread bread;
    Ham ham;

    public HamSand(Bread b, Ham[] h) { super(b, h); }
    public HamSand(Bread b, Ham h) { super(b,new Ham[]{h}); }

    public void print() {
        System.out.println("ハムサンドです。");
    }

    @Override
    public void recipe() {
        System.out.println("薄くスライスした黒豚ロースハムを、新鮮なミルクから作った出来立てバターを塗って軽くトーストしたパンではさむ。");
    }
}
