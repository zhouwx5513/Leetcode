package Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List <Integer> res) {
        if (root != null) {
            if (root.left != null) helper(root.left, res);
            if (root.right != null) helper(root.right, res);
            res.add(root.val);
        }
    }
}
