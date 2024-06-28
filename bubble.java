import java.util.Arrays;

public class bubble {

    public static void bubbly(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                }
            }
        }
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String args[]) {
        int[] nums = new int[] { 1, 6, 3, 9, 3, 35, 66, 23 };
        bubbly(nums);
        System.out.println(Arrays.toString(nums));
    }
}