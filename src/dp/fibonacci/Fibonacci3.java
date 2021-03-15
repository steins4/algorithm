package dp.fibonacci;

public class Fibonacci3 {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[1] = nums[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}
