
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String output = "The collection ";
        if (this.elements.isEmpty()) {
            output += this.name + " is empty.";
        }
        if (elements.size() == 1) {
            output += this.name + " has " + this.elements.size() + " element:" + "\n" + elements.get(0);
        }

        if (elements.size() > 1) {
            String response = "";
            for(String values : elements) {
                response += values + "\n";
            }
            output += this.name + " has " + this.elements.size() + " elements:" + "\n" + response;
            
        }
        return output;
        
    }
    
}
