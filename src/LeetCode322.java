import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LeetCode322 {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
       


    }

    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        if(amount<0) return -1;

        int[] memo = new int[amount];

        memo[0] = 0;
    
        
        int minCoin = Integer.MAX_VALUE;
        for(int i = 0; i<amount;i++){

        }

        return amount;
    }
}
