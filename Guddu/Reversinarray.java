package Guddu;

public class Reversinarray {

    // public static void Reversinarray(int marks[]) {
    //        int first = 0, last = marks.length - 1;

    //      while (first<last) {
    //          int tamp = marks[first];
    //              marks[first]= marks[last];
    //             marks[last] = tamp;

    //          first++;
    //          last--;
    //         }
    //      }

    // public static void main(String[] args) {
    //     int marks[] = { 65, 75, 85, 95, 100 };

    //     Reversinarray(marks);
    //     for (int i = 0; i < marks.length; i++) {
    //         System.out.print(marks[i]+  " ");
    //     }
    //     System.out.println();
    // }
    public static void Reversinarray(int sub[]) {
        int first = 0, last = sub.length - 1;

        while (first < last) {

            int tamp = sub[first];
            sub[first] = sub[last];
            sub[last] = tamp;
        }
        first++;
        last--;
     }
    public static void main(String[] args) {

        int sub[] = { 56, 59, 68, 78, 79, 89 };

        Reversinarray(sub);
        for (int i = 0; i < sub.length; i++) {
            System.out.print(sub[i] + " ");
        }
        System.out.println();
    }
}
