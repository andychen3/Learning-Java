import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return "" + history + "";
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        return Collections.max(this.history);

    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double smallest = this.history.get(0);
        for (double val : this.history) {
            if (val < smallest) {
                smallest = val;
            }
        }
        return smallest;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for(double val : this.history) {
            sum += val;
        }
        return (sum / this.history.size());

    }


    
}
