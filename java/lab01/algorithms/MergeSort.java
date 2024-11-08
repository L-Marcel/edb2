package algorithms;

public class MergeSort {
    public static void sort(int[] arr) {
        if(Utils.isSorted(arr)) return;
        sort(arr, 0, arr.length - 1);
    };

    private static void sort(int[] arr, int start, int end) {
        if(start >= end) return;

        int middle = Math.floorDiv(end - start + 1, 2);

        int leftEnd = start + middle - 1;
        int rightStart = start + middle;

        sort(arr, start, leftEnd);
        sort(arr, rightStart, end);

        int index = 0;
        int leftIndex = start;
        int rightIndex = rightStart;

        int[] temp = new int[end - start + 1];
        while(index <= end - start) {
            if(leftIndex > leftEnd) temp[index++] = arr[rightIndex++];
            else if(rightIndex > end) temp[index++] = arr[leftIndex++];
            else if(arr[leftIndex] < arr[rightIndex]) temp[index++] = arr[leftIndex++];
            else temp[index++] = arr[rightIndex++];
        };

        for(int i = start; i <= end; i++) arr[i] = temp[i - start];
    };
};
