package ClassAbstract.Chara;

public abstract class Chara {
    private String name;
    private int hp;

    public Chara(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public boolean isAlive() {
        return this.hp > 0;
    }

    public String toString() {
        return String.format("%s (%d)", this.name, this.hp);
    }

    public void print() {
        System.out.println(this);
    }

    public abstract void special(Chara c);
}
