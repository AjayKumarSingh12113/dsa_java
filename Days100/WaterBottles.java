package Days100;

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int newfillBottles = numBottles / numExchange;
            int remainBottles = numBottles % numExchange;
            ans = ans + newfillBottles;
            numBottles = newfillBottles + remainBottles;

        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
    }
}
