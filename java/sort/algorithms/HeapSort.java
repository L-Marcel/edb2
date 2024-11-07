package sort.algorithms;

import sort.Utils;

public class HeapSort {
    public static void print(int[] arr) {
        int amount = 0;
        int level = 1;

        for(int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%4d ", arr[i]);
            if(++amount == Math.pow(2, level - 1)) {
                level++;
                amount = 0;
                System.out.println("");
            }
        };
        
        System.out.println("");
    };

    public static void heapfy(int[] arr) {
        heapfy(arr, 0);
    };

    public static void heapfy(int[] arr, int node) {
        int leftChild = (node * 2) + 1;
        int rightChild = leftChild + 1;

        int bigger = node;
        boolean hasLeft = leftChild < arr.length;
        boolean hasRight = rightChild < arr.length;

        if(!hasLeft && !hasRight) return;
        if(hasLeft && arr[leftChild] > arr[bigger]) bigger = leftChild;
        if(hasRight && arr[rightChild] > arr[bigger]) bigger = rightChild;

        Utils.swap(arr, node, bigger);
        heapfy(arr, leftChild);
        heapfy(arr, rightChild);

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
    };
}
