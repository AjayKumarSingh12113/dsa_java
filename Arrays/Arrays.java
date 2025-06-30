package Arrays;
public class Arrays {
    public static void update(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] + 1;
        }
    }
    // linear search 
    public static int linear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // largest in arrry 
    public static int largestnumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestnumver(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    // binary search
    public static int binarysearch(int arr1[], int key) {
        int start = 0;
        int end = arr1.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr1[mid] == key) {
                return mid;
            }
            if (arr1[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;

    }
    // reverse the array
    public static void reverse(int arr1[]) {
        int start = 0;
        int end = arr1.length - 1;
        while (start < end) {
            int temp = arr1[end];
            arr1[end] = arr1[start];
            arr1[start] = temp;

            start++;
            end--;
        }
    }

    public static void pairs(int arr1[]) {
        int total = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                System.out.print("(" + arr1[i] + "," + arr1[j] + ")");
                total++;
            }
            System.out.println();
        }
        System.out.println("total is " + total);

    }

    public static void subarray(int arr1[]) {
        int ts = 0;
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr1[k];
                    //System.out.print(arr1[k] + " ");
                    if (largest < sum) {
                        largest = sum;

                    }

                }
                ts++;
                System.out.println("-" + sum);
                //System.out.println();
                sum = 0;

            }

        }
        System.out.println(largest);
        System.out.println("totoal is " + ts);
    }

    public static int subarray2(int arr1[]) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[arr1.length];
        prefix[0] = arr1[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (largest < sum) {
                    largest = sum;

                }

            }
        }
        return largest;
    }

    public static int kajanse(int arr1[]) {
        int ms = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                if (ms < arr1[i]) {
                    ms = arr1[i];

                }
            }
            return ms;
        }
        for (int i = 0; i < arr1.length; i++) {
            currsum = currsum + arr1[i];
            if (currsum < 0) {
                currsum = 0;
            }
            ms = Math.max(currsum, ms);
        }
        return ms;
    }
    

    public static void main(String[] args) {
        //int arr1[] = { 1, 3, 5, 6, 7, 9 };
        int arr1[] = { -2, -4, -6, -8, -10 };
        System.out.println(kajanse(arr1));
        //System.out.println(subarray2(arr1));
        //reverse(arr1);
        // pairs(arr1);
       //subarray(arr1);
        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print(arr1[i] + " ");
        // }
        // System.out.println();
        // System.out.println(binarysearch(arr1, 70));
        // int arr[] = { 2, 4, 23, 23, 24, 45, 56, 222, 11,0, 1 };
        // System.out.println(largestnumber(arr));
        // System.out.println(smallestnumver(arr));


        //int index = linear(arr, 11);
        // if (index==-1) {
        //     System.out.println("not found");
        // } else {
        //     System.out.println("found"+ "at"+ index);
        // }

        // int[] arr1 = new int[5];
        // int arr2[] = { 1, 32, 3, 345435634, 4346346, 646 };
        // arr1[0]=2;
        // arr1[1]=3;
        // for (int index = 0; index < arr1.length; index++) {
        //     System.out.print(arr1[index]);
        //     System.out.print(arr2[index]);
        // }
        // System.out.println();
        // update(arr2);
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.println(arr2[i]);
        // }
    }
}