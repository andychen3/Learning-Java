public class Container {
    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquidAmount += amount;
            if (this.liquidAmount > 100) {
                this.liquidAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liquidAmount -= amount;
            if (this.liquidAmount < 0) {
                this.liquidAmount = 0;
            }
        }
    }

    public int move(int amount) {
        if (amount > 0) {
            if (this.liquidAmount - amount < 0) {
                amount = this.liquidAmount;
                this.liquidAmount = 0;
                return amount;
            }
            this.liquidAmount -= amount;
            return amount;
        }
        return 0;
    }


    public String toString() {
        return this.contains() + "/100";
    }
}
