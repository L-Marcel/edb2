package sort;

import sort.algorithms.BogoSort;
import sort.algorithms.HeapSort;
import sort.algorithms.MergeSort;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Testing merger sort....");
        // for (int i = 0; i < 30; i++) {
        //     int[] raw = generateRandomArray(10);
        //     MergeSort.sort(raw);
        //     _assert(Utils.isSorted(raw));
        // };

        // System.out.println("Testing bogo sort....");
        // for (int i = 0; i < 30; i++) {
        //level == 0 ||      int[] raw = generateRandomArray(10);
        //     BogoSort.sort(raw);
        //     _assert(Utils.isSorted(raw));
        // };

        System.out.println("Testing heap sort....");
        for (int i = 0; i < 1; i++) {
            int[] raw = generateRandomArray(10);
            HeapSort.print(raw);
            HeapSort.heapfy(raw);
            HeapSort.print(raw);
            // HeapSort.sort(raw);
            // _assert(Utils.isSorted(raw));
        };

        System.out.println("All tests passed!");
    };

    private static void _assert(boolean bool) {
        if(!bool) throw new Error("Teste falhou...");
    };

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(100) - 50;
        return arr;
    };
};