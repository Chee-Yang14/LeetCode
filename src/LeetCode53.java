import java.util.HashMap;

public class LeetCode53 {

    public static void main(String[] args) {
        LeetCode53 test = new LeetCode53();
        int[] max = { -2, 4, 5, 63, 8, -9 };
        System.out.println(test.maxSubArray(max));
    }

    /**
     * @param {number[]} nums
     * @return {number}
     */
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int left = 0;
        int i = 0;
        while (i < nums.length) {
            if (sum < 0 && nums[i] >= sum) {
                sum = 0;
                left = i;
            }
            sum += nums[i];
            max = Math.max(max, sum);
            i++;
        }
        return max;
    };
}
