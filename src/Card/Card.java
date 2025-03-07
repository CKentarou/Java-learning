package Card;

public class Card {
    private int number;
    private String mark;

    public Card(int number, String mark) {
        this.number = number;
        this.mark = mark;
    }

    public int getNumber() {
        return number;
    }

    public String getMark() {
        return mark;
    }

    public void print() {
        System.out.println(String.format("%sの%d", this.mark, this.number));
    }
}
