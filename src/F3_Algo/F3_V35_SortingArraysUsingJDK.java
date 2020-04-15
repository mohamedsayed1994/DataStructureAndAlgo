package F3_Algo;

import java.util.Arrays;

public class F3_V35_SortingArraysUsingJDK {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
