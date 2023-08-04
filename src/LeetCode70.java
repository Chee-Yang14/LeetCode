public class LeetCode70 {
    public static void main(String[] args) {
        LeetCode70 test = new LeetCode70();
        System.out.println(test.climbStairs(5));
    }

    public int climbStairs(int n) {
        if (n <= 1)
            return 1;

        int[] track = new int[n + 1];
        track[1] = 1;
        track[2] = 2;

        for (int i = 3; i <= n; i++) {
            track[i] = track[i - 1] + track[i - 2];
        }
        return track[n];
    }
}
