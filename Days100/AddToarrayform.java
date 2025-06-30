package Days100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToarrayform {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length-1;
        int carry = 0;

        while(i>=0 || k>0){
            int numval = 0;
            if(i>=0){
                numval = num[i];
            }
            int d = k%10;
            int sum = numval + d + carry;

            int digit = sum % 10;
            carry = sum / 10;
            ans.add(digit);

            i--;
            k = k/10;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
