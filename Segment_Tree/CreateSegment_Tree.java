package Segment_Tree;

public class CreateSegment_Tree {
    static int tree[] ;

    public static void init(int n){
        tree = new int[4*n];
    }
    public static int buildST(int arr[], int sti, int start,int end){
        if (start == end) {
            return tree[sti]=arr[start];
        }
        int mid = (start+end)/2;
        buildST(arr, 2*sti+1, start, mid);
        buildST(arr, 2*sti+2, mid+1, end);
        return tree[sti]=tree[2*sti+1]+tree[2*sti+2];

    }
    public static int buildST2(int arr[], int sti, int start,int end){
        if (start == end) {
            return tree[sti]=arr[start];
        }
        int mid = (start+end)/2;
        int l = buildST(arr, 2*sti+1, start, mid);
        int r = buildST(arr, 2*sti+2, mid+1, end);
        return tree[sti] = l+r;
    }
    public static int getSumUtil(int i, int si, int sj ,int qi, int qj){
        if (qj<=si || sj<=qi) {
            return 0;
        }else if (si>=qi && sj<=qj) {
            return tree[i];
        }else{
            int mid = (si+sj)/2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getSum(int arr[],int qi, int qj){
        int n = arr.length;
        return getSumUtil(0,0,n-1,qi,qj);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        //buildST(arr, 0, 0, n-1);
        System.out.println();
        buildST2(arr,0,0,n-1);
        // for (int i = 0; i < tree.length; i++) {
        //     System.out.print(tree[i]+" ");
        // }
        System.out.println(getSum(arr, 2, 5));
    }
}
