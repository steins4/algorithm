package dp.fibonacci;

public class Fibonacci2 {

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] nums = new int[n+1];
        nums[1] = nums[2] = 1;
        return helper(nums, n);

    }

    public static int helper(int[] nums, int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        if (nums[index] != 0) {
            return nums[index];
        }
        nums[index] =  helper(nums, index - 1) + helper(nums, index - 2);
        return nums[index];

    }
}
