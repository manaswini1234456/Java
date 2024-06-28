import java.util.Arrays;

public class quick {

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 4, 3, 1, 2, 7, 34, 87 };
        int n = arr.length;
        quic(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quic(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quic(arr, low, pivotIndex - 1);
            quic(arr, pivotIndex + 1, high);
        }

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }

        }
        i++;
        swap(arr, i, high);
        return i;

    }

    public static void swap(int[] arr, int low, int high) {
        int t = arr[low];
        arr[low] = arr[high];
        arr[high] = t;
    }
}