package pack;

import java.util.Arrays;

public class F3_V32_RadixSort_CountSortStable {
    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
        System.out.println("==> " + Arrays.toString(radixArray));
        radixSort(radixArray, 10,4 );
        System.out.println("==> " + Arrays.toString(radixArray));
    }

    public static void radixSort(int input[], int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }

    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }
        //adjust count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;//to get the position of digit will depend on (1234) --> position 3 value 3
    }
}
