import javax.management.monitor.StringMonitor;

public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
            {1},
            {2, 2},
            {3, 3, 3},
            {4, 4, 4, 4}
          };
        System.out.println(arrayAsString(matrix));
    }
    public static String arrayAsString(int[][] array) {
        int row = array.length;

        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array[i].length; j++) {
                numbers.append(array[i][j]);
            }
            numbers.append("\n");
            
        }
        return numbers.toString();
    }

}
