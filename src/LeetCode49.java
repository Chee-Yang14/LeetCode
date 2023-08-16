import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] car = str.toCharArray();

            Arrays.sort(car);

            String stri = String.valueOf(car);

            if (!map.containsKey(stri)) {
                map.put(stri, new ArrayList<>());
            } else {
                map.get(stri).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}
