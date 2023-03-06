
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(1, 0);
        Money b = new Money(1, 5);
        Money c = new Money(-3, 5);
        Money d = new Money(2, 0);
        
        System.out.println(a.lessThan(b));  // true
        System.out.println(b.lessThan(a));  // false

        System.out.println(a.lessThan(c));  // false
        System.out.println(c.lessThan(a));  // true

        System.out.println(b.lessThan(c));  // false
        System.out.println(c.lessThan(b));  // true

        System.out.println(b.lessThan(d));  // false
        System.out.println(d.lessThan(b));  // true

        System.out.println(c.lessThan(d));  // false
        System.out.println(d.lessThan(c));  // true
    }
}
