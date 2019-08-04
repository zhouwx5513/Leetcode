package Tree;

import util.TreeNode;

public class Diameter_of_Binary_Tree {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
    private int depth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        max = Math.max(max,leftDepth+rightDepth);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
