import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (nums.length <= 3) {
            if (nums.length == 3 && nums[0] + nums[1] + nums[2] == 0) {
                ans.add(Arrays.asList(nums[0], nums[1], nums[2]));
                return ans;
            } else {
                return ans;
            }
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    s.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
}
