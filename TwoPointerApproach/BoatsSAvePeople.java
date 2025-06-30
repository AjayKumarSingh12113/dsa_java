package BitManupulation.TwoPointerApproach;

import java.util.*;

public class BoatsSAvePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int st = 0;
        int end = people.length - 1;
        int count = 0;
        while (st <= end) {
            if (people[st] + people[end] <= limit) {
                st++;
                end--;
            } else {
                end--;
            }
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        
    }
}
