package BinaryTrees;

import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentSum {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int d){
            this.val = d;
            this.left = null;
            this.right = null;
        }
    }
    private int maxF =0;
    private HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        countsum(root);
        ArrayList<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)==maxF){
                list.add(key);
            }
        }

        int result[] = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }
        return result;

    }
    public int countsum(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftsum =countsum(root.left);
        int rightsum = countsum(root.right);

        int sum = root.val+ leftsum + rightsum ;
        map.put(sum,map.getOrDefault(sum,0)+1);
        maxF = Math.max(maxF,map.get(sum));

        return sum;   
    }
    public static void main(String[] args) {
        
    }
}
