import java.util.Arrays;
import java.util.Scanner;

public class Challenge{
    public static void main(String[] args) {
        int[] a = getIntegers(5);
        int[] sorted = sortArray(a);
        printArray(sorted);
    }


    public static int[] getIntegers(int n) {
        Scanner s= new Scanner(System.in);
        int[] a= new int[n];
        System.out.println("Enter " + n + " integer values:\r");
        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        return a;
    }

    public static void printArray(int[] a) {
       for (int i =0; i<a.length; i++) {
           System.out.println("Element" + i + " contents " + a[i]);
       }
    }

    public static int[] sortArray(int[] a) {
//        int[] sortedArray = new int[a.length];
//        for(int i=0;i<a.length;i++) {
//            sortedArray[i] = a[i];
//        }
        int[] sortedArray = Arrays.copyOf(a,a.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for ( int i=0; i <sortedArray.length-1;i++){
               if( sortedArray[i]<sortedArray[i+1]) {
                   temp = sortedArray[i];
                   sortedArray[i] =sortedArray[i+1];
                   sortedArray[i+1]=temp;
                   flag = true;
               }
            }
        }



        return sortedArray;
    }
}
