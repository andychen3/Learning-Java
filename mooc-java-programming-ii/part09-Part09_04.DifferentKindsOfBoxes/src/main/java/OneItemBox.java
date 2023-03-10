import java.util.ArrayList;

public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> items;


    public OneItemBox() {
        this.capacity = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.capacity == 0) {
            this.items.add(item);
            this.capacity++;
        } else {
            return;
        }

    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }
    
}
