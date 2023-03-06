import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> storage;
    private int weight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.storage = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        // int currWeight = 0;

        // for (Suitcase cargo : storage) {
        //     this.weight += cargo.totalWeight();
        // }
        

        if (suitcase.totalWeight() + this.weight <= this.maxWeight) {
            this.storage.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
        

    }

    public String toString() {
        return this.storage.size() + " suitcases (" + this.weight + " kg)";
    }

    public void printItems() {
        for (Suitcase things : storage) {
            things.printItems();
        }
    }

}
