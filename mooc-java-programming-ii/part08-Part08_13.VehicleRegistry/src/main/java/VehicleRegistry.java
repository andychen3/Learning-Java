import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<String, LicensePlate> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();

    }

    public boolean add(LicensePlate licensePlate, String owner) {
          
        if (!(registry.containsKey(owner))) {
            registry.put(owner, licensePlate);
            return true;
        }
        return false;

    }

    public String get(LicensePlate licensePlate) {
        for (String key : registry.keySet()) {
            if (registry.get(key).equals(licensePlate)) {
                return key;
            }
        }
        return null;

    }

    public boolean remove(LicensePlate licensePlate) {
        for (String key : registry.keySet()) {
            if (registry.get(key).equals(licensePlate)) {
                registry.remove(key);
                return true;
            }
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate value : registry.values()) {
            System.out.println(value);
        }
    }

    public void printOwners() {
        ArrayList<String> array = new ArrayList<>();;

        for (String key : registry.keySet()) {
            if (!array.contains(key)) {
                System.out.println(key);
                array.add(key);
            }
        }
    }

}
