package ch06;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.height);
        System.out.println(Card.width);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        c1.width = 50;
        c2.height = 80;
    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
