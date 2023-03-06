import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    // private int currWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int currWeight = this.totalWeight();
        
        if (currWeight + item.getWeight() <= this.maxWeight){
            this.items.add(item);
            currWeight += item.getWeight();
        }     
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";     
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)"; 
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)"; 
        }
    }

    public void printItems(){
        for (Item things: items) {
            System.out.println(things);
        }

    }

    public int totalWeight(){
        int currWeight = 0;

        for (Item things : items) {
            currWeight += things.getWeight();
        }
        return currWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heavyItem = items.get(0);
        
        for (Item things : items) {
            if (heavyItem.getWeight() < things.getWeight()) {
                heavyItem = things;
            }
        }
        return heavyItem;



    }
    
}
