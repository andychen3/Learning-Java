import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        hand.stream()
            .forEach(val -> System.out.println(val));
    }

    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        int hand1Sum = this.hand.stream()
                        .mapToInt(s -> s.getValue())
                        .sum();
        int hand2Sum = o.hand.stream()
                        .mapToInt(s -> s.getValue())
                        .sum();
        return hand1Sum - hand2Sum;
    }

    public void sortBySuit() {
        BySuitInValueOrder lo = new BySuitInValueOrder();
        Collections.sort(this.hand, lo);
    }
}
