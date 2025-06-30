package Guddu;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        int score[] = new int[100];

        Scanner Sc = new Scanner(System.in);


        score[1] = Sc.nextInt(); //virat goli
        score[10] = Sc.nextInt(); //rohit sharma
        score[15] = Sc.nextInt(); //subnum gill

        score[1] = score[1]+2 ;

        System.out.println("virat:" + score[1]);
        System.out.println("rohit :" + score[10]);
        System.out.println("gill:" + score[15]);


    }
}
