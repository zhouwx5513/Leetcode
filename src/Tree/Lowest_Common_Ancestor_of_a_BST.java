package Tree;

import util.TreeNode;

public class Lowest_Common_Ancestor_of_a_BST {
    /*
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if (pVal > parentVal && qVal > parentVal) return lowestCommonAncestor(root.right, p, q);
        else if (pVal < parentVal && qVal < parentVal) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        TreeNode node = root;
        while (node != null) {
            int parentVal = node.val;
            if (pVal > parentVal && qVal > parentVal) node = node.right;
            else if (pVal < parentVal && qVal < parentVal) node = node.left;
            else return node;
        }
        return null;
    }
}
