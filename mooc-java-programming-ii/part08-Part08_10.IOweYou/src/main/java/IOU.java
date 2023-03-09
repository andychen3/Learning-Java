import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> newIOU;

    public IOU() {
        this.newIOU = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.newIOU.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.newIOU.getOrDefault(toWhom, 0.0);

    }
}
