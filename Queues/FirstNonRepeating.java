package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void nonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[(int) ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1);
            } else {
                System.out.print(q.peek());
            }

        }
       
    }
    public static void firstNonRepeatings(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             q.add(ch);
             freq[ch-'a']++;

             while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.remove();
             }
        }
        if (q.isEmpty()) {
            System.out.print(-1);
        }else{
            System.out.println(q.peek());
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        nonRepeating(str);
        firstNonRepeatings(str);
    }
}
