public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations() {
        this.observations += 1;
    }

    public String toString() {
        return this.getName() + " (" + this.getLatinName() + "): " + this.getObservations() + " observations";
    }

}
