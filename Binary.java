public class Binary {

    public static int bsearch(int[] arr, int low, int high, int target) {
        /*
         * int n = arr.length;
         * int index = -1;
         * low = 0;
         * high = n - 1;
         */

        if (low > high) {
            return -1;

        }
        int mid = low + (high - low) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (arr[mid] < target) {
            return bsearch(arr, mid + 1, high, target);
        } else {
            return bsearch(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        // int low = 0;
        // int high = arr.length - 1;
        int target = 6;
        System.out.println(bsearch(arr, 0, n - 1, target));

    }
}