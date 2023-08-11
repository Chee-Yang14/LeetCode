public class LeetCode198 {
    public static void main(String[] args) {
        LeetCode198 test = new LeetCode198();
        int[] rob = { 2, 4, 5, 63, 8, 9 };

        System.out.println(test.rob(rob));
    }

    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int[] rob = new int[nums.length];

        rob[0] = nums[0];
        rob[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            rob[i] = Math.max(nums[i] + rob[i - 2], rob[i - 1]);
        }

        return rob[nums.length - 1];
    }

}
