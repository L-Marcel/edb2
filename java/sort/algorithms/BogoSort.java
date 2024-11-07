package sort.algorithms;

import sort.Utils;

public class BogoSort {
    public static void sort(int[] arr) {
        int[] newArray = sort(arr, 0);
        for(int i = 0; i < arr.length; i++) arr[i] = newArray[i];
    };

    private static int[] sort(int[] arr, int offset) {
        for(int i = offset; i < arr.length; i++) {
            int[] newArr = arr.clone();
            newArr[offset] = arr[i];
            newArr[i] = arr[offset];
            newArr = sort(newArr, offset + 1);
            if(Utils.isSorted(newArr)) return newArr;
        };

        return arr;
    };
};
