import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());

        this.storage.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.get(storageUnit) == null) {
            return new ArrayList<String>();
        }
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        for (String value : this.storage.get(storageUnit)) {
            if (value.equals(item)) {
                this.storage.get(storageUnit).remove(item);
                if (this.storage.get(storageUnit).isEmpty()) {
                    this.storage.remove(storageUnit);
                }
                return;
            }
        
            
        }

    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>(this.storage.keySet());
        return list;
        // ArrayList<String> list = new ArrayList<>();
        // for (String key : this.storage.keySet()) {
        //     list.add(key);
        // }
        // System.out.println(list);
        // return list;
    }
}
