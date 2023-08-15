import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
        }

        List<Integer> ans = new ArrayList<>();
        int[] ans2 = new int[k];
        int n = 0;

        while (n < k) {
            Map.Entry<Integer, Integer> entry = heap.poll();
            ans2[n] = entry.getKey();
            n++;
        }

        return ans2;
    }

}
