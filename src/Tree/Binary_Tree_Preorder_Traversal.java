package Tree;

import util.TreeNode;
import java.util.*;


public class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List <Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) helper(root.left, res);
            if (root.right != null) helper(root.right, res);
        }
    }
}
