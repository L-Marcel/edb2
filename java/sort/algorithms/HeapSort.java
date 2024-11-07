package sort.algorithms;

import sort.Utils;

public class HeapSort {
    public static int[] heapfy(int[] arr) {
        // int parent = Math.floorDiv(arr.length - 1, 2);
        // while(parent >= 0) {
        //     System.out.println(parent);
        //     int left = parent * 2 + 1;
        //     int right = left + 1;

        //     int biggerChild = left;
        //     if(right <= arr.length - 1 && arr[left] < arr[right]) biggerChild = right;

        //     if(arr[parent] < arr[biggerChild]) arr = Utils.swap(arr, parent, biggerChild);
        //     parent = Math.floorDiv(left - 2, 2);
        // };

        return arr;
    };
}
