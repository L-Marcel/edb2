package sort;

import sort.algorithms.BogoSort;
import sort.algorithms.HeapSort;
import sort.algorithms.MergeSort;

import java.time.LocalTime;
import java.util.Random;

public class Main {
    private static Random rand = new Random();
    public static void main(String[] args) {
        rand.setSeed(LocalTime.now().toNanoOfDay());
        System.out.println("Testing merge sort....");
        for (int i = 0; i < 30; i++) {
            int[] raw = generateArray(10);
            MergeSort.sort(raw);
            _assert(Utils.isSorted(raw));
        };

        System.out.println("Testing heap sort....");
        for (int i = 0; i < 30; i++) {
            int[] raw = generateArray(10);
            HeapSort.heapfy(raw);
            HeapSort.sort(raw);
            _assert(Utils.isSorted(raw));
        };

        System.out.println("Testing bogo sort....");
        for (int i = 0; i < 30; i++) {
            int[] raw = generateArray(10);
            BogoSort.sort(raw);
            _assert(Utils.isSorted(raw));
        };

        System.out.println("All tests passed!");
    };

    private static void _assert(boolean bool) {
        if(!bool) throw new Error("Teste falhou...");
    };

    private static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(100) - 50;
        return arr;
    };
};