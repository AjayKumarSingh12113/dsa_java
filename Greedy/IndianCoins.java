package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static int changecoin(Integer[] coins, int amt) {
        Arrays.sort(coins, Comparator.reverseOrder());
        int countcoin = 0;
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amt) {
                while (coins[i] <= amt) {
                    countcoin++;
                    s.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i)+" ");
        }
        return countcoin;
    }
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amt = 590;
        System.out.println(changecoin(coins, amt));
    }
}
