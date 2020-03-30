package pack;

import java.util.Arrays;

public class F3_V27_MergeSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(intArr));
        mergeSort(intArr,0,intArr.length);
        System.out.println(Arrays.toString(intArr));

    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);//split the right array {20, 35, -15}
        mergeSort(input, mid, end);//split the left array {7, 55, 1, -22}
        merge(input, start, mid, end);// after split start to merge
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) { // mean is already sorted
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
