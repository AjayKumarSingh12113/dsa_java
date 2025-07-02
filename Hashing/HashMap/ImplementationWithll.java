package Hashing.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationWithll {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;// for node
        private int N ;// for buckets
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N =4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i]=new LinkedList<>();
            }
        }
        public int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%N;
        }
        public int searchingInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        public void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N= N*2;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i]=new LinkedList<>();
            }
            // nodes - add in buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public  void put(K key , V val){
            int bi = hashFunction(key);
            int di = searchingInLL(key , bi);// node index
            // di- two case possible valid ; -1
            if (di != -1) {// valid having india 150 but we put india 200
                Node node = buckets[bi].get(di);
                node.value = val;
            }else{
                buckets[bi].add(new Node(key, val));
                n++;
            }
            double lambda = (double)n/N;
            if (lambda>2.0) {
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchingInLL(key , bi);
            if (di != -1) {
                return true;
            }else{
                return false;
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchingInLL(key , bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }

        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchingInLL(key , bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                return node.value;
            }else{
                return null;
            }
        }
        
        public  ArrayList keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node element: ll){
                    keys.add(element.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
        
    }
    
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("Us", 50);
        hm.put("chila",35);
        System.out.println(hm.isEmpty());
        //System.out.println(hm);
        System.out.println(hm.get("Us"));
        System.out.println(hm.remove("India"));
        //ArrayList<String> keys = hm.keySet();
        // for (int i = 0; i < keys.size(); i++) {
        //     System.out.print(keys.get(i)+" ");
        // }
        System.out.println(hm.containsKey("Us"));
        System.out.println(hm.isEmpty());
        
    }
}
