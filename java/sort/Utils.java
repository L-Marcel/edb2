package sort;

public class Utils {
    public static void swap(int[] arr, int a, int b)  {
        int value = arr[a];
        arr[a] = arr[b];
        arr[b] = value;
    };
    
    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) return false;
        };

        return true;
    };
};
