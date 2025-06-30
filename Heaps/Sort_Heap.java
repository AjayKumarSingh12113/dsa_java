package BitManupulation.Heaps;

public class Sort_Heap {
    public static void heapify(int nums[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxidx = i;

        if (left < size && nums[left] > nums[maxidx]) {
            maxidx = left;
        }
        if (right < size && nums[right] > nums[maxidx]) {
            maxidx = right;
        }

        if (maxidx != i) {
            int temp = nums[i];
            nums[i]= nums[maxidx];
            nums[maxidx]=temp;

            heapify(nums, maxidx, size);
        }
    }
    public static void sortHeap(int nums[]){
        // making max heap 
        int n = nums.length;
        for(int i=n/2; i>=0; i--){
            heapify(nums,i,n);
        }

        // sorting
        for(int i=n-1 ; i>=0; i--){
            //swap first and last
            int temp = nums[0];
            nums[0]=nums[i];
            nums[i]=temp;

            //calling heapify 0 to n-1
            heapify(nums,0,i);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,4,5};
        sortHeap(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
