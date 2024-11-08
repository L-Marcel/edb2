package algorithms;

public class BogoSort {
    public static void sort(int[] arr) {
        if(Utils.isSorted(arr)) return;
        sort(arr, 0);
    };

    private static void sort(int[] arr, int offset) {
        if(offset == arr.length - 1) return;

        for(int i = offset; i < arr.length; i++) {
            Utils.swap(arr, offset, i);
            sort(arr, offset + 1);
            if(Utils.isSorted(arr)) return;
            Utils.swap(arr, offset, i);
        };
    };
};
