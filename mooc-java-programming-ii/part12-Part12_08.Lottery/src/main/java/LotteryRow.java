
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random draw = new Random();
        while (this.numbers.size() < 7) {
            int randomNum = draw.nextInt(40)+1;
            if (!this.numbers.contains(randomNum)) {
                this.numbers.add(randomNum);
            }
        }
            
        }


    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for(Integer nums : this.numbers) {
            if (nums == number) {
                return true;
            }
        }
        return false;
    }
}

