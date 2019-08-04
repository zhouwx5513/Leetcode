package Tree;
import util.Node;

public class Maximum_Depth_of_N_Tree {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for(Node node : root.children)
            max = Math.max(max,maxDepth(node));
        return max + 1;
    }
}
