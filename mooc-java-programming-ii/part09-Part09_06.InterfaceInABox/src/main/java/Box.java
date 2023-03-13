
import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maximumCapacity;
    
    public Box(double maximumCapacity) {
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maximumCapacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
    public double weight() {
        double sum = 0;
        for (Packable things : this.items) {
            sum += things.weight();
        }
        return sum;
    }

}
