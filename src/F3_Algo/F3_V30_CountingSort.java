package F3_Algo;

import java.util.Arrays;

public class F3_V30_CountingSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 8, 2, 7, 10, 4, 3};
        countingSort(arr, 2, 10);
        System.out.println("======> " + Arrays.toString(arr));
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < input.length; i++) {
            //to know the position of the value
            //Ex input[i] = 5 and minVal = 1 so countArr = 5-1 =4
            // the right position of value 5 is index 4 and then increase count
            countArray[input[i] - min]++;
        }

        int j = 0; //use to write the value in input array
        for (int i = min; i <= max; i++) {//i use to traverse countArray
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
