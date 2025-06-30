package Tries;
public class Implements {
    static class Node{
        Node children[]= new Node[26];
        boolean eow = false;
        Node(){
            for (int i = 0; i < 26; i++) {
                children[i]=null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level)-'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
            }
            curr = curr.children[idx];// curr ko update kr do
        }
        curr.eow=true;// end me curr me true storee kr do 
    }
    public static boolean search(String key){
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
            curr = curr.children[idx];// curr ko update kr do
        }
        return curr.eow==true;
    }
    public static boolean startwith(String word){
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
            curr = curr.children[idx];// curr ko update kr do
        }
        return true;// end me curr me true storee kr do 
    }
    public static boolean wordBreak(String key){
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0,i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String words[]={"the","their","a","any","there","thee"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
         //     System.out.println(search("thee"));
        //     System.out.println(search("any"));
        //     System.out.println(search("ajay"));
        //System.out.println(wordBreak("anyther"));
        String prefix = "thei";
        String prefix1 = "any";
        System.out.println(startwith(prefix1));
        System.out.println(startwith(prefix));
        System.out.println(startwith("ajay"));
     }
}
