package BitManupulation.Backtracking;

public class Rev {
    public static void add2(int arr[] , int i){
        if (i == arr.length ) {
            return ;
        }
        add2(arr, i+1);
        arr[i]=arr[i]-2;
        return;
    }
    public static void addone(int arr[] , int i){
        if (i == arr.length ) {
            return ;
        }
        arr[i]=i+1;
        addone(arr, i+1);
        arr[i]=arr[i]-2;
        return;
    }


    //subset
    public static void subsets(String s, String st, int i){
        if (i == s.length() ) {
            System.out.println(st);
            return;
        }

        subsets(s, st+s.charAt(i), i+1);
        subsets(s, st, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        add2(arr, 0);


        int nums[] = new int[5];
        addone(nums, 0);
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i]+" ");
            //System.out.println();
            //System.out.print(nums[i]+" ");
        }
        String s = "abc";
        subsets(s, "", 0);
    }
}
