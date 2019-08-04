package Tree;
import util.TreeNode;
import java.util.*;

public class Binary_Tree_Level_Order_Traversal {

    //给定一个二叉树，返回其节点值自上向下的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while(count-- > 0){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
            }
            res.add(list);
        }
        return res;
    }
//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while(count-- > 0){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
            }
            stack.add(list);
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
