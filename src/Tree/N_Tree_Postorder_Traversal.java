package Tree;

import util.Node;

import java.util.*;

public class N_Tree_Postorder_Traversal {
    public List<Integer> postorder(Node root) {
        List <Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(Node root, List <Integer> res) {
        if (root != null) {
            for(Node node : root.children)
                helper(node, res);
            res.add(root.val);
        }
    }
}
