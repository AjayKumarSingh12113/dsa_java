package Heaps;

import java.util.PriorityQueue;

public class Weakest_Soldiers {
    static class Row implements Comparable<Row> {
        int soldier;
        int idx;

        public Row(int soldier, int idx) {
            this.soldier = soldier;
            this.idx = idx;
        }

        @Override

        public int compareTo(Row r2) {
            if (this.soldier == r2.soldier) {
                return this.idx - r2.idx;
            } else {
                return this.soldier - r2.soldier;
            }
        }
    }

    public static void weaksol(int mat[][], int k) {
        PriorityQueue<Row> p = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count += mat[i][j] == 1 ? 1 : 0;

            }
            p.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.print("s" + p.remove().idx);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        int k = 2;
        weaksol(mat, k);
    }
}
