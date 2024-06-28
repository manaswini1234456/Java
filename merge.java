import java.util.Arrays;

public class merge {

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 4, 1, 3, 2 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void divide(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        } else {
            int mid = low + (high - low) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, high);
            conquer(arr, low, mid, high);
        }

    }

    public static void conquer(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merged[k++] = arr[i++];
        }
        while (j <= high) {
            merged[k++] = arr[j++];

        }
        for (int q = 0, p = low; q < merged.length; q++, p++) {
            arr[p] = merged[q];

        }

    }
}