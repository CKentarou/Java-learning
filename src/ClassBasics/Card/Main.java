package ClassBasics.Card;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Card testCard = new Card(12, "ハート");
        testCard.print();

        ArrayList<Card> cards = new ArrayList<>();
        String[] marks = new String[] {"ハート", "スペード", "ダイヤ", "クローバ"};

        //52種類のカードを生成してArrayに追加
        for (String mark : marks) {
            for (int num = 1; num <= 13; num++ ) {
                cards.add(new Card(num, mark));
            }
        }

        //全カード表示
        System.out.println("カードを全部表示");
        for (Card card : cards) {
            card.print();
        }

        //カードをシャッフル
        Collections.shuffle(cards); //Cllections.shuffleはリスト内の要素をランダムに並び替えるメソッド
        System.out.println("シャッフルしたカードを全部表示");
        for (Card card : cards) {
            card.print();
        }
    }
}
