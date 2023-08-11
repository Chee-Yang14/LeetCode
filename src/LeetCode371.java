public class LeetCode371 {

    public static void main(String[] args) {
        LeetCode371 test = new LeetCode371();

        System.out.println(test.getSum(5, -9));
    }

    public int getSum(int a, int b) {

        int count = 0;
        int sum = 0;
        if (a > b) {
            count = b;
            sum = a;
        } else if (b > a) {
            count = a;
            sum = b;
        }
        boolean done = false;

        while (done == false) {
            if (count > 0) {
                count--;
                sum++;
            } else if (count < 0) {
                count++;
                sum--;
            } else if (count == 0) {
                done = true;
            }
        }

        return sum;
    }
}
