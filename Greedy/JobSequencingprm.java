package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingprm {
    static class Job {
        int deadline;
        int id;
        int profit;

        public Job(int i, int d, int p) {
            this.deadline = d;
            this.id = i;
            this.profit=p;
        }

    }
    public static void main(String[] args) {
        // int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        //int jobsInfo[][] = { { 2, 50 }, { 2, 10 }, { 2, 40 }, { 3, 70 } };
        int jobsInfo[][] = { { 2, 20 }, { 3, 20 }, { 7, 100 }, { 2, 70 } ,{3,60}};
        ArrayList<Job> jobs = new ArrayList<>();// [job0 (4,20), job1 (1,10), job2 (1,40), job3 (1,30)]

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);// as the base of  profit sort kr dega decreasing way me
        //[job2 (1,40), job3 (1,30), job0 (4,20), job1 (1,10)] after sorting
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int p = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);// job2 (1,40)here 1 is deadline nad 40 is profit and job 2 is id
            if (curr.deadline > time) {// deadline=1, profit=40
                seq.add(curr.id);
                time++;
                p += curr.profit;

            }

        }
        // print all
        System.out.println("max job = " + seq.size());
        System.out.println("profit = " + p);
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
    }
}
