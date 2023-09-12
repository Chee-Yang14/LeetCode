import java.util.Stack;

// more time on this one
public class LeetCode739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] temp = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                temp[idx] = i - idx;
            }
            stack.push(i);
        }
        return temp;
    }
}
