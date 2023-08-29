import java.util.ArrayList;
import java.util.HashSet;

public class LeetCode349 {
    public static void main(String[] args) {
        LeetCode349 ans = new LeetCode349();
        int[] lowest = { 2, 2, 1, 3 };
        int[] highest = { 1, 2, 3, 3, 3, 3, 6 };

        System.out.println(ans.intersection(lowest, highest));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] lowest;
        int[] highest;
        HashSet<Integer> ans = new HashSet<Integer>();

        ArrayList<Integer> num = new ArrayList<>();
        if (nums1.length > nums2.length) {
            lowest = nums2;
            highest = nums1;
        } else {
            lowest = nums1;
            highest = nums2;
        }

        for (int i = 0; i < lowest.length; i++) {
            num.add(lowest[i]);
        }

        for (int i = 0; i < highest.length; i++) {
            if (num.contains(highest[i])) {
                ans.add(highest[i]);
            }
        }

        int i = 0;
        int[] theAns = new int[ans.size()];
        // iterating over the hashset
        for (Integer ele : ans) {
            theAns[i++] = ele;
        }

        return theAns;
    }
}
