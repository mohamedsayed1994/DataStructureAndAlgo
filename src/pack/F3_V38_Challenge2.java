package pack;

import java.util.Arrays;

public class F3_V38_Challenge2 {
    //change insertion sort to use recursion not iteration
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("==> " + Arrays.toString(arr));
        insertionSort(arr, arr.length);
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
//
//            int newElement = arr[firstUnsortedIndex];
//            int i;
//            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
//                arr[i] = arr[i - 1];
//            }
//            arr[i] = newElement;
//
//        }
        System.out.println("==> " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }
        insertionSort(input, numItems - 1);
        int newElement = input[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;
        System.out.println("numItems = " + numItems);
        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" , ");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
    }
}
