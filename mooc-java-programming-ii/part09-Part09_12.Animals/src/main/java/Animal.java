public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(getName() + " eats");
    }

    void sleep() {
        System.out.println(getName() + " sleeps");
    }

    String getName() {
        return this.name;
    }

}
