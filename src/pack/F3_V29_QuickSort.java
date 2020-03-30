package pack;

import java.util.Arrays;

public class F3_V29_QuickSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(intArr));
        quickSort(intArr, 0, intArr.length);
        System.out.println(Arrays.toString(intArr));
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {//mean that the array have 1 element
            return;
        }
        // get the index of pivot element in the sorted element
        //should all element in the left is less than it and all element in the right is greater than it
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }
            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

    }
}
