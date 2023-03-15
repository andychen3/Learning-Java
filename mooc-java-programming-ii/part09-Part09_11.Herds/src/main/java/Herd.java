import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public String toString() {
        String output = "";
        for (Movable animal : this.herd) {
            output += animal.toString() + "\n";
        }
        return output;
    }

    public void addToHerd(Movable movable){
        herd.add(movable);

    }


    @Override
    public void move(int dx, int dy) {
        for (Movable animal : this.herd) {
            animal.move(dx, dy);
        }
    }
    
}
