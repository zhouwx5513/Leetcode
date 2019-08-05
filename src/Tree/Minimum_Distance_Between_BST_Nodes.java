package Tree;

import util.TreeNode;

public class Minimum_Distance_Between_BST_Nodes {
    private int last;
    private int min = Integer.MAX_VALUE;
    private boolean flag = false;

    public int minDiffInBST(TreeNode root) {
        //last=Integer.MAX_VALUE;
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);

        if(flag==false) {
            last = root.val;
            flag = true;
        }else{
            min=Math.min(min,root.val-last);
            last = root.val;
        }
        inOrder(root.right);
    }
}
/*
       private int last;
        private int min;

        public int minDiffInBST(TreeNode root) {
            min=Integer.MAX_VALUE;
            last=Integer.MAX_VALUE;
            inOrder(root);
            return min;
        }

        private void inOrder(TreeNode root){
            if(root==null) return;
            inOrder(root.left);
            if(last!=Integer.MAX_VALUE){
                min=Math.min(min,root.val-last);
            }
            last=root.val;
            inOrder(root.right);
        }
        */

