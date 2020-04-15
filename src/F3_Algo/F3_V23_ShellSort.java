package F3_Algo;

import java.util.Arrays;

public class F3_V23_ShellSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(intArr));
        for (int gap = intArr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArr.length; i++) {
                int newElement = intArr[i];
                int j = i;
                while (j >= gap && intArr[j - gap] > newElement) {
                    intArr[j] = intArr[j - gap];
                    j -= gap;
                }
                intArr[j] = newElement;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}
