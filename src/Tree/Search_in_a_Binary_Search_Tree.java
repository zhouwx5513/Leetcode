package Tree;
import util.TreeNode;

public class Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(root.val==val) return root;
            root = root.val>val? root.left:root.right;
        }
        return root;
    }
}
