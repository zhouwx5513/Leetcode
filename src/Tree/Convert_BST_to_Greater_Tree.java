package Tree;

import util.TreeNode;

public class Convert_BST_to_Greater_Tree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        //更新累加值
        sum += root.val;
        //改变节点值
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
