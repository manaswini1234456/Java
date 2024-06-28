import java.util.Arrays;

public class Insertion {

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void insert(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 8, 3, 0, 35, 67 };
        insert(nums);
        System.out.println(Arrays.toString(nums));

    }
}