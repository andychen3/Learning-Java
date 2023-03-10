public class ProductWarehouse extends Warehouse{
    private String name;

    

    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.name = productName;

    }


    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getName() + ": " + super.toString();
    }



    // @Override
    // public void addToWarehouse(double amount){
    //     super.addToWarehouse(amount);
    //     this.history.add(super.getCapacity());
    // }

    // @Override
    // public void takeFromWarehouse(double amount){
    //     super.takeFromWarehouse(amount);
    //     this.history.add(super.getCapacity());
    // }
    
    
}
