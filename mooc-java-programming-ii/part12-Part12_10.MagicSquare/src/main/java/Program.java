import java.util.ArrayList;
import java.util.*;
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        int[][] sums = {
            {4,9,2},
            {8,1,6},
            {3,5,7}
        };  
        System.out.println(sumsOfColumns(sums));
        
        // MagicSquareFactory msFactory = new MagicSquareFactory();
        // System.out.println(msFactory.createMagicSquare(3));
    }
    public static int[] sumsOfColumns(int[][] square) {
        int[] sums = new int[square[0].length];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                sums[j] += square[i][j];
                }
            }
        
        return sums;
            
        }
}
