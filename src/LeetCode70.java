public class LeetCode70 {
    public static void main(String[] args) {
        LeetCode70 test = new LeetCode70();
        System.out.println(test.climbStairs(43));
    }

    public int climbStairs(int n) {

        if (n <= 2)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
