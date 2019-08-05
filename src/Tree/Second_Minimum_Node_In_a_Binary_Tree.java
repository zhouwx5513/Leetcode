package Tree;

import util.TreeNode;

public class Second_Minimum_Node_In_a_Binary_Tree {
    public int findSecondMinimumValue(TreeNode root) {
        long ans = traversal(root, root.val);
        return ans > Integer.MAX_VALUE ? -1 : (int)ans;
    }

    //所有大于value节点的最小值即为第二小的节点
    public long traversal(TreeNode root, int value){
        if(root != null){
            if(root.val > value)
                return root.val;
            return Math.min(traversal(root.left, value), traversal(root.right, value));
        }
        return (long)Integer.MAX_VALUE+1;
    }
}
