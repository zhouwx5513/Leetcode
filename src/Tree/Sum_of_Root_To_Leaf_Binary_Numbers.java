package Tree;

import util.TreeNode;

public class Sum_of_Root_To_Leaf_Binary_Numbers {
    public int sumRootToLeaf(TreeNode root) {
        return sum(root,0);
    }

    public int sum(TreeNode root, int s){
        if (root == null) return 0;
        if (root.right == null && root.left == null) return root.val+(s<<1);
        return sum(root.left,(s<<1) + root.val) + sum(root.right, (s<<1) + root.val);
    }
}
