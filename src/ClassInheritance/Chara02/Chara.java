package ClassInheritance.Chara02;

public class Chara {
    private String name;
    private int hp;

    public Chara(String name) {
        this.name = name;
        this.hp = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public void change(String name) {
        this.name = name;
    }

    public void change(int hp) {
        this.hp  = hp;
    }

    public void damage() {
        int dp = (int)(Math.random() * 11) + 10;
        this.hp -= dp;
        System.out.println(String.format("%sは%dのダメージ", this.name, dp));
    }

    public void attack(Chara c) {
        System.out.println(String.format("%sが%sに攻撃！！", this.name, c.getName()));
        c.damage();
    }

    public String toString() {
        return String.format("%s (%d)", this.name, this.hp);
    }

    public void print() {
        System.out.println(this);
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

}
