package ClassBasics.Chara01;

public class Chara {
    private String name;
    private int HP;

    public Chara(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void damage() {
        int damage = (int) (Math.random() * 11 + 10);
        System.out.print(String.format("%dダメージ受けました", damage));
        this.HP -= damage;
    }

    public void attack(Chara c) {
        c.damage();
    }

    public void print() {
        System.out.println(String.format("%s (%d)", this.name, this.HP));
    }

    public void play() {
        System.out.println(this.getName() + "は遊んでいる");
        this.HP -= 5;
    }

    public void rest() {
        System.out.println(this.getName() + "は休んだ");
        this.HP += 10;
    }

    public boolean isAlive() {
        return this.HP > 0;
    }
}
