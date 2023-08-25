import java.util.HashMap;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int ans = 0;

        HashMap map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], (int) map.get(nums[i]) + 1);
                largest = Math.max(largest, (int) map.get(nums[i]));
                if ((int) map.get(nums[i]) == largest) {
                    ans = nums[i];
                }
            } else {
                map.put(nums[i], 1);
            }
        }

        return ans;
    }
}
