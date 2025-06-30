package Tries;

import java.util.ArrayList;

public class WordBreak {
    static class TrieNode{
        TrieNode children[]= new TrieNode[26];
        boolean eow = false;
        TrieNode(){
            for (int i = 0; i < 26; i++) {
                children[i]=null;
            }
        }
    }
    static class Trie{
        private TrieNode root;
        public Trie(){
            root= new TrieNode();
        }

        public  void insert(String word){
            TrieNode curr = root;
            for (int level = 0; level < word.length(); level++) {
                int idx = word.charAt(level)-'a';
                if (curr.children[idx]==null) {
                    curr.children[idx]=new TrieNode();
                }
                curr = curr.children[idx];
            }
            curr.eow=true;
        }

        public  boolean search(String key){
            TrieNode curr = root;
            for (int level = 0; level < key.length(); level++) {
                int idx = key.charAt(level)-'a';
                if (curr.children[idx]==null) {
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.eow==true;
        }
    }
    public static boolean wordBreak(String s, ArrayList<String> wordDict) {
        Trie trie = new Trie();
        for (String string : wordDict) {
            trie.insert(string);
        }
        return helper(s,trie);
    }
    public static boolean helper(String key,Trie trie){
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (trie.search(key.substring(0,i)) && helper(key.substring(i),trie)) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("ajay");
        arr.add("raja");
        arr.add("i");
        String key = "ajayiw";
        System.out.println(wordBreak(key, arr));
        
    }
}
