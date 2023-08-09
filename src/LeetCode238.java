public class LeetCode238 {
    // Redo this one
    //
    public static void main(String[] args) {
        LeetCode238 test = new LeetCode238();
        int[] arr = { 1, 4, 5, 23, 4 };
        System.out.println(test.productExceptSelf(arr)[4]);
    }

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int prefix = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] += prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix *= nums[i];
        }

        return ans;
    }
}