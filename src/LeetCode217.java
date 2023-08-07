import java.util.HashMap;

public class LeetCode217 {
    public static void main(String[] args) throws Exception {
        int[] nums = { 1, 3, 2, 1 };
        LeetCode217 test = new LeetCode217();
        System.out.println(test.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hashDub = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            if (hashDub.containsKey(nums[i])) {
                return true;
            } else {
                hashDub.put(nums[i], false);
            }
        }
        return false;
    }
}
