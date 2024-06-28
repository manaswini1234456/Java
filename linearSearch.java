public class linearSearch {
    public static int linSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 8, 3, 5, 7, 3 };
        int target = 3;
        System.out.println(linSearch(arr, target));
    }
}