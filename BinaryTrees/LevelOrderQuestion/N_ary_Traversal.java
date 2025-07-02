package BinaryTrees.LevelOrderQuestion;

import java.util.*;



public class N_ary_Traversal {
    static class TreeNode{
        int val;

        List<TreeNode> children;

        public TreeNode(int _val, List<TreeNode> _children) {
        val = _val;
        children = _children;
    }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return result;
        }
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                result.add(new ArrayList<>(list));
                list.clear();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                list.add(curr.val);
                for(TreeNode item : curr.children){
                    q.add(item);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
