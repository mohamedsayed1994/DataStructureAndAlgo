package pack;

import java.util.Arrays;

public class F3_V19_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("==> " + Arrays.toString(arr));
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }
            swapItem(arr,largestIndex,lastUnsortedIndex);
        }
        System.out.println("==> " + Arrays.toString(arr));
    }

    public static void swapItem(int[] arr, int i, int x) {
        if (i == x) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[x];
        arr[x] = temp;
    }
}
