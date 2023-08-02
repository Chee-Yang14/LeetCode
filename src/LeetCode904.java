import java.util.ArrayList;

public class LeetCode904 {
    public static void main(String[] args) throws Exception {
        int[] fruits = { 3, 1, 2, 1, 3 };
        LeetCode904 totalFruit = new LeetCode904();
        System.out.println(totalFruit.totalFruit(fruits));

    }

    public int totalFruit(int[] fruits) {
        ArrayList<Integer> fruitBasket = new ArrayList<>();
        int fruitCollected = 0;
        int maxFruit = 0;
        int left = 0;
        boolean once = false;
        boolean reseting = false;

        for (int right = 0; right < fruits.length;) {
            reseting = false;
            if (fruits[left] != fruits[right] && once == false) {
                left = right;
                once = true;
            }
            if (!fruitBasket.contains(fruits[right]) && fruitBasket.size() != 2) {
                fruitBasket.add(fruits[right]);
            }
            if (fruitBasket.contains(fruits[right])) {
                fruitCollected++;
                maxFruit = Math.max(maxFruit, fruitCollected);
            }

            if (!fruitBasket.contains(fruits[right]) && fruitBasket.size() >= 2) {
                fruitBasket.clear();
                fruitCollected = 0;
                right = left;
                once = false;
                reseting = true;
            }
            if (reseting == false) {
                right++;
            }
        }
        return maxFruit;
    }
}