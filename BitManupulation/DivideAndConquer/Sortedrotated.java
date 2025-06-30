package BitManupulation.DivideAndConquer;

public class Sortedrotated {
    public static int samed(int arr[], int target) {
        int a = sortedandrotated(arr, target, 0, arr.length - 1);
        return a;
        
    }
    public static int sortedandrotated(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return sortedandrotated(arr, target, si, mid - 1);
            } else {
                return sortedandrotated(arr, target, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return sortedandrotated(arr, target, mid + 1, ei);
            } else {
                return sortedandrotated(arr, target, si, mid - 1);
            }
        }
    }

    public static int searchmore(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;
       
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= target && target <= arr[mid]) {
                    ei = mid - 1;

                } else {
                    si = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        System.out.println(sortedandrotated(arr, target, 0, arr.length - 1));
        System.out.println(searchmore(arr, target));
        System.out.println(samed(arr, target));
    }
    
}
