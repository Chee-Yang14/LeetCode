import java.util.HashMap;

public class LeetCode167 {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { (int) map.get(target - nums[i]), i + 1 };
            }
            map.put(nums[i], i + 1);
        }

        return new int[] {};
    }
}
