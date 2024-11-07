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
        for(int i = Math.floorDiv(arr.length, 2); i >= 0; i--) {
            heapfy(arr, i);
        };
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

        if(node != bigger) {
            Utils.swap(arr, node, bigger);
            heapfy(arr, bigger);
        };
    };
}
