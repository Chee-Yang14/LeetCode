public class LeetCode213 {
    public static void main(String[] args) {
        LeetCode213 test = new LeetCode213();
        int[] rob = { 2, 4, 5, 63, 8, 9 };
        System.out.println(test.rob(rob));
    }

    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int[] rob = new int[nums.length];
        int[] rob2 = new int[nums.length];

        rob[0] = nums[0];
        rob[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length - 1; i++) {

            rob[i] = Math.max(nums[i] + rob[i - 2], rob[i - 1]);
        }

        rob2[nums.length - 1] = nums[nums.length - 1];
        rob2[nums.length - 2] = Math.max(nums[nums.length - 1], nums[nums.length - 2]);

        for (int i = nums.length - 3; i >= 1; i--) {
            rob2[i] = Math.max(nums[i] + rob2[i + 2], rob2[i + 1]);
        }

        return Math.max(rob[nums.length - 2], rob2[1]);
    }
}
