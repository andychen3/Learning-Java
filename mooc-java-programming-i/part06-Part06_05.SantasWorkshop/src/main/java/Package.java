import java.util.*;

public class Package {
    
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();;
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int sumOfWeights = 0;

        for(Gift item : gifts) {
            sumOfWeights += item.getWeight();
        }
        return sumOfWeights;

    }


}
