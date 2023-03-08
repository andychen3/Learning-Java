import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = {3, 1, 5, 99, 3, 12};
        // System.out.println("Smallest: " + MainProgram.smallest(array));
        // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        // int[] numbers = {-1, 6, 9, 8, 12};
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smaller = array[0];
        for (int element : array) {
            if (element < smaller) {
                smaller = element;
            }
        }
        return smaller;
    }

    public static int indexOfSmallest(int[] array) {
        int smaller = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smaller) {
                smaller = array[i];
                index = i;
            }
        } 
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smaller = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smaller) {
                smaller = array[i];
                index = i;
            }
        } 
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int hold = array[index1];
        array[index1] = array[index2];
        array[index2] = hold;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }

}
