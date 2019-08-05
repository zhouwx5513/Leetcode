package Tree;

import util.TreeNode;
import java.util.*;

public class Binary_Tree_Paths {
    LinkedList<String> paths = new LinkedList();
    public List<String> binaryTreePaths(TreeNode root) {
        construct_paths(root, "");
        return paths;
    }
    public void construct_paths(TreeNode root, String path) {
        if(root!=null){
            path+=new String(root.val+"");
            if(root.left == null && root.right == null){
                paths.add(path);
            }
            else{
                path+="->";
                construct_paths(root.left,path);
                construct_paths(root.right,path);
            }
        }
    }
}
