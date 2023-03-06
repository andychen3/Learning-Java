
public class Main {

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 7);
        Item phone = new Item("Nokia 3210", 2);
        Item brick = new Item("brick", 5);
        Item asbrick = new Item("asbrick", 3);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        pekkasCase.addItem(asbrick);

        Suitcase ecase = new Suitcase(10);
        ecase.addItem(brick);
        ecase.addItem(asbrick);

        Hold hold = new Hold(128);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        hold.addSuitcase(ecase);


        // System.out.println("The suitcases in the hold contain the following items:");
        System.out.println(hold);
        // hold.printItems();
    }

}
