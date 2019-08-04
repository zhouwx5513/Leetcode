package Tree;

import util.TreeNode;

import java.util.*;

public class Path_Sum {

    /**
     * leetcode 437
     * 找出路径和等于给定数值的路径总数。
     */
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    int helper(TreeNode root, int sum){
        if(root == null) return 0;
        sum -= root.val;
        return (sum == 0 ? 1 : 0) + helper(root.left, sum) + helper(root.right, sum);
    }

    /**
     * leetcode 112
     * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
     *
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(sum==root.val&&root.left==null&&root.right==null) return true;
        sum -= root.val;
        return hasPathSum(root.left, sum)||hasPathSum(root.right, sum);
    }

    /**
     * letcode 113
     * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径
     *
     */
    public List<List<Integer>> pathSumList(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, sum, res, new ArrayList<Integer>());
        return res;
    }
    private void helper(TreeNode root, int sum, List<List<Integer>> res, ArrayList<Integer> tmp) {
        if(root==null) return;
        tmp.add(root.val);
        if(root.left == null && root.right == null && sum == root.val) res.add(new ArrayList<>(tmp));
        helper(root.left,sum-root.val,res,tmp);
        helper(root.right,sum-root.val,res,tmp);
        tmp.remove(tmp.size()-1);
    }
}
