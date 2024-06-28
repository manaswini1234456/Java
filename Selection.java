import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 8, 3, 0, 5, 7, 35 };
        select(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void select(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, last, maxIndex);
        }
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
}