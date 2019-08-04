package Tree;

import util.TreeNode;

import java.util.*;

public class Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            int size = count;
            List<Integer> list = new ArrayList<>();
            double ave = 0;
            while(count-- > 0){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
                ave+=cur.val;
            }
            res.add(ave/size);
        }
        return res;
    }
}
