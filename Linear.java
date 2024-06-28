public class binarySearch {
    public static int bsearch(int[] arr, int target) {
        int n = arr.length;
        int index = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                index = mid;
                return index;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }
}

public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    int target = 2;
    System.out.println(bsearch(arr, target));
}
