import java.util.HashMap;

public class LeetCode1 {
    public static void main(String[] args) throws Exception {
        LeetCode1 test = new LeetCode1();
        int[] arr = new int[] { 1, 4, 5, 3 };
        System.out.println(test.twoSum(arr, 9).toString());
        System.out.println(1 / 2);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            if (map.containsKey(target - nums[i])) {
                return new int[] { (int) map.get(target - nums[i]), i };
            }
        }

        return new int[] {};
    }
}
