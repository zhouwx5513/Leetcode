package Tree;

import util.TreeNode;

public class Closest_Binary_Search_Tree_Value {
    long res = Long.MAX_VALUE;

    public int closestValue(TreeNode root, double target) {
        if (root == null) return 0;
        helper(root, target);
        return new Long(res).intValue();
    }

    private void helper(TreeNode root, double target) {
        if (root == null) return;
        helper(root.left, target);
        res = Math.abs(res - target) > Math.abs(root.val - target) ? root.val : res;
        helper(root.right, target);
    }

 /*   public int closestValue(TreeNode root, double target) {
        if (target > root.val) {
            if (root.right == null) {
                return root.val;
            } else {
                double diff = Math.abs(target - root.val);
                int rightMin = closestValue(root.right, target);
                double rightDiff = Math.abs(rightMin - target);
                return diff < rightDiff ? root.val : rightMin;
            }
        } else {
            if (root.left == null) {
                return root.val;
            } else {
                double diff = Math.abs(target - root.val);
                int leftMin = closestValue(root.left, target);
                double leftDiff = Math.abs(leftMin - target);
                return diff < leftDiff ? root.val : leftMin;
            }
        }
    }
    */
}
