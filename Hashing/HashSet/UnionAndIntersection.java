package Hashing.HashSet;

import java.util.HashSet;

public class UnionAndIntersection {
    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr1) {
            hs.add(i);
        }
        for (int i : arr2) {
            hs.add(i);
        }
        return hs.size();
    }
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        int count =0;
        for (int i : arr1) {
            hs.add(i);
        }
        for (int i : arr2) {
            if (hs.contains(i)) {
                count++;
                hs.remove(i);// uske liye count bad gya usko set me se delete bhi kr do taki oh agli bar count na ho paye
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
        
    }
    
}
