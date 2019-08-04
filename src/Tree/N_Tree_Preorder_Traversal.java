package Tree;

import util.Node;

import java.util.ArrayList;
import java.util.List;

public class N_Tree_Preorder_Traversal {
    public List<Integer> preorder(Node root) {
        List <Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(Node root, List <Integer> res) {
        if (root != null) {
            res.add(root.val);
            for(Node node : root.children)
                helper(node, res);
        }
    }
}
