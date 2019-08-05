package Tree;

import util.TreeNode;

public class Minimum_Absolute_Difference_in_BST {
    TreeNode pre = null;
    int res = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        if (pre != null) res = Math.min(res, Math.abs(root.val - pre.val));
        pre = root;
        helper(root.right);
    }
}
