package BitManupulation.BinarySearchTree;

import java.util.Stack;

public class BSTIterator {
    static class TreeNode{
        int val;
        TreeNode left , right;
        public TreeNode(int k){
            this.val =k;
        }
    }
    Stack<TreeNode> stack ;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode node = root;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }
    
    public int next() {
        TreeNode hal = stack.pop();
        int val = hal.val;
        TreeNode node = hal.right;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
        return val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    public static void main(String[] args) {
        
    }
}