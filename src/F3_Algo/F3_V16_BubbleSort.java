package F3_Algo;

import java.util.Arrays;

public class F3_V16_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        System.out.println("==> " + Arrays.toString(arr));
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapItem(arr, i, i + 1);
                }
            }
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
