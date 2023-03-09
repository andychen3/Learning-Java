
public class Program {

    public static void main(String[] args) {
        // Test your program here
        StorageFacility unit = new StorageFacility();
        unit.add("a111","mouse");
        unit.add("a111","cheese");
        unit.add("a111","cheese");
        unit.add("b123","projector");
        unit.add("g63","ice skates");
        System.out.println(unit.contents("b123"));
        unit.remove("b123","projector");
        System.out.println(unit.contents("b123").size());
        unit.storageUnits();

          

    }
}
