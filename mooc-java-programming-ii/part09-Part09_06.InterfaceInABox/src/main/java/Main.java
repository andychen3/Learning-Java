
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10); 
        box.add( new Book("Horstman", "Core Java",5) );
        box.add( new Book("Beck", "Test Driven Development",0.5) );
        box.weight();
        System.out.println(box);
    }

}
