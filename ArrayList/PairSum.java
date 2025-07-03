package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static void pairsum(int arr[],int target){
        ArrayList<Integer> list = new ArrayList<>();
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            if (arr[st]+arr[end]==target) {
                list.add(st);
                list.add(end);
                break;
            }
            if (arr[st]+arr[end]<target) {
                st++;
            }else{
                end--;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[] ={2,4,5,6,8};
        pairsum(arr, 10);
    }
}
