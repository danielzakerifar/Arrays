import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int capacity = 10;
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Array= " + Arrays.toString(array));
        int[] reversedArray = reverseArray(array);
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }

    public static int[] getArray(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println(" Enter the elements: ");
        for (int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] reverseArray(int[] array) {
        Stack<Integer> reversedArray = new Stack<Integer>();
        int[] rArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            Integer b = array[i];
            reversedArray.push(b);
        }
        for (int i = 0; i < array.length; i++) {
            rArray[i] = reversedArray.pop().intValue();
        }
        return rArray;
    }

    public static void printArray(int[] array) {
        System.out.println("the array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }
}