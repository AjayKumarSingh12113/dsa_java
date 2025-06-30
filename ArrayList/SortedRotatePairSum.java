package ArrayList;

public class SortedRotatePairSum {
    public static boolean rotatepairSum(int arr[],int target){
        int n = arr.length;
        int pivot =n-1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                pivot = i;
                break;
            }
        }
        int rp = pivot;         
        int lp = (pivot + 1) % n;
        
        while(lp != rp){
            if(arr[lp]+arr[rp] == target){
                return true;
            }
            else if(arr[lp]+arr[rp] < target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {7,9,2,4,6};
        System.out.println(rotatepairSum(arr, 110));
    }
}
