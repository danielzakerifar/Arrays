import java.util.Scanner;

public class MinimumElementChalenge {
    public static void main(String[] args) {
        int[] array = readIntegers(5);
        int min = findMin(array);
        System.out.println("The minimum number is: " + min);
    }

    public static int[] readIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the elements: ");
        int[] array = new int[capacity];
        for(int i=0;i<capacity;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++) {
            if(array[i]< min) {
                min = array[i];
            }
        }
        return min;
        }

    }


