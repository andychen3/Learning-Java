import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!cart.containsKey(product)) {
            cart.put(product, new Item(product, 1, price));
        } else if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        }
        
    }

    public int price() {
        int sum = 0;
        for (Item items : cart.values()) {
            sum += items.price();
        }
        return sum;

    }

    public void print() {
        for (String key : cart.keySet()) {
            System.out.println(cart.get(key).toString());
        }
    }
}
