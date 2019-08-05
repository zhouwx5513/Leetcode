package Tree;

import util.TreeNode;

public class Sum_of_Left_Leaves {
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node){
        if(node==null) return;
        if(node.left!=null&&node.left.left==null && node.left.right==null) ans+=node.left.val;
        dfs(node.left);
        dfs(node.right);
    }
}
