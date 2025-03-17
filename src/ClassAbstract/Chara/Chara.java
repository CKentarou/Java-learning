package ClassAbstract.Chara;

public abstract class Chara {
    public static final int MAX_HP = 100;
    public static final int MIN_HP = 0;
    public static final int MAX_DAMAGE = 20;
    public static final int MIN_DAMAGE = 10;
    public static final int HP_BORDER = MAX_HP / 2;
    public static final int GOOD_STATE = 0;
    public static final int BAD_STATE = 1;

    private String name;
    private int hp;
    private int state;

    public Chara(String name) {
        this.name = name;
        this.hp = MAX_HP;
        this.state = GOOD_STATE;
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
        int dp = (int)(Math.random() * (MAX_DAMAGE - MIN_DAMAGE + 1)) + MIN_DAMAGE;
        this.hp -= dp;
        System.out.println(String.format("%sは%dのダメージ", this.name, dp));

        if ( (state == GOOD_STATE) && (hp <= HP_BORDER) ) {
            state = BAD_STATE;
        }
    }

    public void attack(Chara c) {
        System.out.println(String.format("%sが%sに攻撃！！", this.name, c.getName()));
        c.damage();
    }

//    stateを使ったメソッド
    public void chohatsu() {
        if (state == GOOD_STATE) {
            System.out.println(String.format("%sは元気に挑発", this.name));
        } else {
            System.out.println(String.format("%sは元気がないので挑発できない", this.name));
        }
    }

    public boolean isAlive() {
        return this.hp > MIN_HP;
    }

    public String toString() {
        return String.format("%s (%d)", this.name, this.hp);
    }

    public void print() {
        System.out.println(this);
    }

    public abstract void special(Chara c);
}
