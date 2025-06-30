package Tries;

public class PrefixPromblem {
    static class Node{
        Node children[]= new Node[26];
        boolean eow = false;
        int freq;
        Node(){
            for (int i = 0; i < 26; i++) {
                children[i]=null;
            }
            this.freq = 1;
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level)-'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];// curr ko update kr do
        }
        curr.eow=true;// end me curr me true storee kr do 
    }
    public static String findUniquePrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            prefix.append(word.charAt(level));
            if (curr.children[idx].freq == 1) {
                return prefix.toString(); // Return when unique prefix is found
            }
            curr = curr.children[idx];
        }
        return word; // If no unique prefix, return full word
    }
    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for (String string : arr) {
            insert(string);
        }
        for (String one: arr) {
            System.out.println(one+" -> "+ findUniquePrefix(one));
        }
    }
}
