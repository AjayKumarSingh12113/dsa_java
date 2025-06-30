package Guddu;

import java.util.*;

public class Arrayeupdate {



    public static void linearsearch(int score[]) {
        for (int i = 0; i < score.length; i++) {
            if (score[i] == 98) {
                System.out.println(i);

            }

        }
    }

    public static int binarysearch(int score[],int target) {
        int si = 0;
        int ei = score.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (score[mid] == target) {
                return mid;

            }
            if (score[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }

        }
        return -1;
    }

    public static void update(int score[],int a) {
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] + 1;
            a++;

        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int score[] = { 96, 97, 98, 99 };
        int a = 2;
        //update(score, a);
        //System.out.println(a);


        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println();
        linearsearch(score);
        System.out.println(binarysearch(score, 98));
    }
    
   
    
}
