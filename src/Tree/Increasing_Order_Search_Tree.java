package Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Increasing_Order_Search_Tree {
    List<Integer> res = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        TreeNode fakeNode = new TreeNode(-1);
        TreeNode head = fakeNode;
        for(int i = 0;i<res.size();i++){
            TreeNode cur = new TreeNode(res.get(i));
            fakeNode.right = cur;
            fakeNode = cur;
        }
        return head.right;
    }

    public void helper(TreeNode root) {
        if (root != null) {
            if (root.left != null) helper(root.left);
            res.add(root.val);
            if (root.right != null) helper(root.right);
        }
    }
}
