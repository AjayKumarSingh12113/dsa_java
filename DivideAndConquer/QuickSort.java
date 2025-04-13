package DivideAndConquer;

public class QuickSort {
    public static void quicksorts(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // partition
        int idxofpivot = partition(arr, si, ei);
        // sorting
        quicksorts(arr, si, idxofpivot - 1);// left side
        quicksorts(arr, idxofpivot + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quicksorts(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
